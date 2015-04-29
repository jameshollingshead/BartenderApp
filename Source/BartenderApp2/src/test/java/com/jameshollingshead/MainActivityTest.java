package com.jameshollingshead;

import android.app.Activity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.robolectric.RobolectricShadowOfLevel16.shadowOf;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class MainActivityTest {


    @Test
    public void testMainActivityExists() throws Exception {
        assertTrue(Robolectric.buildActivity(MainActivity.class).create().get() != null);
    }

    @Test
    public void testMainActivityContentViewIsActivityMain() throws Exception {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();

        assertEquals(R.id.activity_main, Robolectric.shadowOf(activity).getContentView().getId());
    }

//    @Test
//    public void testDrinkSearchFragmentExists() throws Exception {
//        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();
//
//       assertEquals(R.id.fragment_DrinkSearch, Robolectric.shadowOf(activity).getContentView().);
//    }
}
