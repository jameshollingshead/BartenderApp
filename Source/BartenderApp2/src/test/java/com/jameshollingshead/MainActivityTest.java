package com.jameshollingshead;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
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
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.robolectric.RobolectricShadowOfLevel16.shadowOf;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;

import junit.framework.Assert;


@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class MainActivityTest {

    String drinkSearchFragmentTag = "DrinkSearchFragment";


    @Test
    public void mainActivityIsNotNull() throws Exception {
        assertTrue(Robolectric.buildActivity(MainActivity.class).create().get() != null);
    }

    @Test
    public void givenTheActivityIsMainActivityThenTheContentViewIsActivityMain() throws Exception {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();

        assertEquals(R.id.activity_main, Robolectric.shadowOf(activity).getContentView().getId());
    }

    @Test
    public void theContentViewActivityMainContainsDrinkSearchFragment() throws Exception {
        Activity activity = Robolectric.buildActivity(MainActivity.class)
                .create().start().resume().visible().get();

        DrinkSearchFragment drinkSearchFragment = (DrinkSearchFragment) ((FragmentActivity) activity)
                .getSupportFragmentManager()
                .findFragmentById(R.id.activity_main);

        assertNotNull("Fragment should have existed", drinkSearchFragment);

        assertEquals(drinkSearchFragmentTag, drinkSearchFragment.getTag());
    }

    @Test
    public void searchResultsActivityShouldBeLaunchedWhenSearchButtonIsPressedInActivityMain() throws Exception {
        Activity activity = Robolectric.buildActivity(MainActivity.class)
                .create().start().resume().visible().get();
        Button searchButton = (Button) activity
                .findViewById(R.id.drink_search_search_button);

        Robolectric.clickOn(searchButton);

        ShadowActivity shadowActivity = Robolectric.shadowOf(activity);
        Intent startedIntent = shadowActivity.getNextStartedActivity();
        ShadowIntent shadowIntent = Robolectric.shadowOf(startedIntent);
        assertEquals("Launched different activity from what was expected",
                SearchResultsActivity.class.getName(), shadowIntent.getComponent().getClassName());

    }

}
