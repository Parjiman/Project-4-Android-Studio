package com.example.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openUrl(View view) {
        try {
            EditText searchField = findViewById(R.id.searchField);
            String url = searchField.getText().toString();
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(i);
        } catch (Exception e) {
            String msg = "url tidak valid ";
            Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
            toast.show();
//            Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
//            i.putExtra(SearchManager.QUERY , url);
//            startActivity(i);
        }

    }

    public void dialNumber(View view){
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:088225046774"));
        startActivity(i);
    }


}







