package com.example.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listItem;
    private String[] namaNegara = new String[]{
            "Indonesia", "Malaysia", "Singapore",
            "Italia", "Inggris", "Belanda", "Argentina",
            "Chile", "Mesir", "Uganda"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("List View Sederhana");

        listItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namaNegara);

        listItem.setAdapter(adapter);

        listItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Anda memilih " + namaNegara[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}