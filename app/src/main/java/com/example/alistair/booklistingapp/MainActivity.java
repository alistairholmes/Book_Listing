package com.example.alistair.booklistingapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private BookAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ListView listView = (ListView) findViewById(R.id.list);

    mAdapter = new BookAdapter(this, new ArrayList<Book>());

    listView.setAdapter(mAdapter);


    // Todo The network call occurs off the UI thread using an AsyncTask or similar threading object.
}