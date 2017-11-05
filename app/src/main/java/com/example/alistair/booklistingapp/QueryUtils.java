package com.example.alistair.booklistingapp;

// Helper methods related to requesting and receiving Book data from Google Books API.

import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class QueryUtils {

    // Tag for the log messages
    private static final String LOG_TAG = QueryUtils.class.getSimpleName();

    /**
     * Create a private constructor because no one should ever create a {@link QueryUtils} object.
     * This class is only meant to hold static variables and methods, which can be accessed
     * directly from the class name QueryUtils (and an object instance of QueryUtils is not needed).
     */
    private QueryUtils() {
    }

/*
    */
/*//*
/ The app fetches book data related to the query via an HTTP request from the Google Books API,
    public static ArrayList<Book> fetchBookData(String requestUrl) {
        // Create URL object
        URL url = createUrl(requestUrl);

        // Perform HTTP request to the URL and receive a JSON response back
        String jsonResponse = null;
        try {
            jsonResponse = makeHttpRequest(url);
        } catch (IOException e) {
            Log.e(LOG_TAG, "Problem making the HTTPRequest.", e);
        }

        // Extract relevant fields from the JSON response and create a list of {@link Book}s
        List<Book> books =extractFeatureFromJson(jsonResponse);

        // Return the list of {@link Earthquake}s
        return books;*//*


    }
*/
    // Returns new URL object from the given string URL.
    private static URL createUrl(String stringUrl) {
        URL url = null;
        try {
            url = new URL(stringUrl);
        } catch (MalformedURLException e) {
            Log.e(LOG_TAG, "Problem with building the URL", e);
        }
        return url;
    }

    // Make an HTTP request to the given URL and return a String as the response.
    private static String makeHttpUrlRequest(URL url) throws IOException {
        String jsonResponse = "";

        // Return early if the url is null
        if (url == null) {
            return jsonResponse;
        }

        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;

        // The app checks whether the device is connected to the internet and responds appropriately.
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            // If the request was successful (response code 200),
            // then read the input stream and parse the response.
            if (urlConnection.getResponseCode() == 200) {
                Log.d(LOG_TAG, "TEST: Connection to server was successful!");
            } else {
                Log.e(LOG_TAG, "TEST: Unable to connect to server" + urlConnection.getResponseCode());
            }
        } catch (IOException e) {
            Log.e(LOG_TAG, "TEST: Error in retreiving book json information.");
        } finally {
            // The result of the request is validated to account for a bad server response or lack of server response.
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }

        return jsonResponse;

    }





    // Todo The JSON response is parsed correctly, and relevant information is stored in the app.

    // Todo The ListView is properly populated with the information parsed from the JSON response.

    // Todo When there is no data to display, the app shows a default TextView that informs the user how to populate the list.
}



