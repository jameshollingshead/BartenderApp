package com.jameshollingshead;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.robolectric.util.FragmentTestUtil.startFragment;

/**
 * Created by jhollingshead on 5/11/15.
 */

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class SearchResultsFragmentTest {

    @Test
    public void searchResultsFragmentIsNotNull() throws Exception {
        Activity activity = Robolectric.buildActivity(SearchResultsActivity.class)
                .create().start().resume().visible().get();
        assertNotNull(activity);
        DrinkSearchResultsFragment drinkSearchResultsFragment = (DrinkSearchResultsFragment) ((FragmentActivity) activity)
                .getSupportFragmentManager()
                .findFragmentById(R.id.activity_search_results);
        assertNotNull(drinkSearchResultsFragment);
    }

    @Test
    public void searchResultsFragmentContainsListView() throws Exception{
        Activity activity = Robolectric.buildActivity(SearchResultsActivity.class)
                .create().start().resume().visible().get();
        assertNotNull(activity);

        ListView listView = (ListView) activity.findViewById(R.id.drink_list_view);
        assertNotNull(listView);
    }

    @Test
    public void hardCodedValuesForDrinkListViewAreFooBarBotBaz() throws Exception {
        Activity activity = Robolectric.buildActivity(SearchResultsActivity.class)
                .create().start().resume().visible().get();
        assertNotNull(activity);
        ListView listView = (ListView) activity.findViewById(R.id.drink_list_view);

        assertEquals("Foo2", listView.getItemAtPosition(0));
        assertEquals("Bar2", listView.getItemAtPosition(1));
        assertEquals("Bot2", listView.getItemAtPosition(2));
        assertEquals("Baz2", listView.getItemAtPosition(3));
    }
}
