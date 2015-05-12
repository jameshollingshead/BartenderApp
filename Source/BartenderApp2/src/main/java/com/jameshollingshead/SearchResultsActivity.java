package com.jameshollingshead;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

import com.jameshollingshead.helpers.FragmentUtilities;

import javax.inject.Inject;

/**
 * Created by jhollingshead on 5/5/15.
 */
public class SearchResultsActivity extends FragmentActivity{

    Bundle bundle = new Bundle();

    String[] drinkList = new String[] {"Foo2", "Bar2", "Bot2", "Baz2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        DrinkSearchResultsFragment drinkSearchResultsFragment = new DrinkSearchResultsFragment();
        bundle.putStringArray("drinkNamesList", drinkList);
        drinkSearchResultsFragment.setArguments(bundle);

        FragmentUtilities.insertFragmentIntoLayout(drinkSearchResultsFragment,
                "DrinkSearchResultsFragment", R.id.activity_search_results, this);
    }
}
