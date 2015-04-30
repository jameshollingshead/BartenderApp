package com.jameshollingshead;

import android.app.Activity;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.robolectric.RobolectricShadowOfLevel16.shadowOf;
import android.support.v4.app.FragmentManager;
import android.view.View;


@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class MainActivityTest {

    String drinkSearchFragmentTag = "DrinkSearchFragment";

    @Test
    public void testMainActivityExists() throws Exception {
        assertTrue(Robolectric.buildActivity(MainActivity.class).create().get() != null);
    }

    @Test
    public void testMainActivityContentViewIsActivityMain() throws Exception {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();

        assertEquals(R.id.activity_main, Robolectric.shadowOf(activity).getContentView().getId());
    }

    @Test
    public void testActivityMainContainsDrinkSearchFragment() throws Exception {
        Activity activity = Robolectric.buildActivity(MainActivity.class)
                .create().start().resume().visible().get();

        DrinkSearchFragment drinkSearchFragment = (DrinkSearchFragment) ((FragmentActivity) activity)
                .getSupportFragmentManager()
                .findFragmentById(R.id.activity_main);

        assertNotNull("Fragment should have existed", drinkSearchFragment);

        assertEquals(drinkSearchFragmentTag, drinkSearchFragment.getTag());
    }
}
