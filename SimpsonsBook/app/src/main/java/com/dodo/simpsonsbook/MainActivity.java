package com.dodo.simpsonsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        simpson homer = new simpson("homers simpson","nuclear",R.drawable.homer);
        simpson lisa = new simpson("lisa simpson","student",R.drawable.lisa);
        simpson bart = new simpson("bart simpson","student",R.drawable.bart);
        final ArrayList<simpson> simpsonsList = new ArrayList<>();
        simpsonsList.add(homer);
        simpsonsList.add(lisa);
        simpsonsList.add(bart);

        customadapter customadapterr =new customadapter(simpsonsList,MainActivity.this);
        listView.setAdapter(customadapterr);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("SelectedSimpson",simpsonsList.get(position));
                startActivity(intent);
            }
        });

    }
}
