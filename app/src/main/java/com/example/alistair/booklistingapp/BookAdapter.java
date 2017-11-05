package com.example.alistair.booklistingapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Context context, ArrayList<Book> bookList) {
        super(context, 0, bookList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.book_list, parent, false);
        }

        // Get current position of the book
        Book currentBook = getItem(position);

        // Assign to the title id in the layout
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Display the title of the book in that text view
        titleTextView.setText(currentBook.getTitle());

        // Assign to the author id in the layout
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author_text_view);
        // Display the author of the book in that text view
        authorTextView.setText(currentBook.getAuthor());


        return listItemView;
    }
}

// Todo The user can enter a word or phrase to serve as a search query.
