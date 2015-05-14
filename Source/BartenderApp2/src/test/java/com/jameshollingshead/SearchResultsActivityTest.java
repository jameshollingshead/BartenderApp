package com.jameshollingshead;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;
import org.robolectric.shadows.ShadowIntent;
import org.robolectric.util.ActivityController;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.robolectric.RobolectricShadowOfLevel16.shadowOf;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import junit.framework.Assert;

import java.io.OutputStream;



/**
 * Created by jhollingshead on 5/5/15.
 */

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class SearchResultsActivityTest {

    String drinkSearchResultsFragmentTag = "DrinkSearchResultsFragment";

    @Test
    public void searchResultsActivityIsNotNull() throws Exception {
        assertTrue(Robolectric.buildActivity(SearchResultsActivity.class).create().get() != null);
    }

    @Test
    public void  searchResultsActivityUsesActivitySearchResultsAsTheContentView() throws Exception {
        Activity activity = Robolectric.buildActivity(SearchResultsActivity.class).create().get();

        assertEquals(R.id.activity_search_results, Robolectric.shadowOf(activity).getContentView().getId());
    }

    @Test
    public void theContentViewActivitySearchResultsContainsDrinkSearchResultsFragment() throws Exception {
        Activity activity = Robolectric.buildActivity(SearchResultsActivity.class)
                .create().start().resume().visible().get();

        DrinkSearchResultsFragment drinkSearchResultsFragment = (DrinkSearchResultsFragment) ((FragmentActivity) activity)
                .getSupportFragmentManager()
                .findFragmentById(R.id.activity_search_results);

        assertNotNull("Fragment should have existed", drinkSearchResultsFragment);

        assertEquals(drinkSearchResultsFragmentTag, drinkSearchResultsFragment.getTag());
    }

    @Test
    public void clickingOnASearchResultLaunchesTheDrinkRecipeScreen() throws Exception {
        Activity activity = Robolectric.buildActivity(SearchResultsActivity.class)
                .create().start().resume().visible().get();

        ListView searchResultsList = (ListView) activity
                .findViewById(R.id.drink_list_view);

        Robolectric.shadowOf(searchResultsList).performItemClick(0);

        ShadowActivity shadowActivity = Robolectric.shadowOf(activity);
        Intent startedIntent = shadowActivity.getNextStartedActivity();
        ShadowIntent shadowIntent = Robolectric.shadowOf(startedIntent);
        assertEquals("Launched different activity from what was expected",
                DrinkRecipeActivity.class.getName(), shadowIntent.getComponent().getClassName());
    }

}
