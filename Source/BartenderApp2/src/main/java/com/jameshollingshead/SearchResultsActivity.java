package com.jameshollingshead;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

import javax.inject.Inject;

/**
 * Created by jhollingshead on 5/5/15.
 */
public class SearchResultsActivity extends FragmentActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

    }
}
