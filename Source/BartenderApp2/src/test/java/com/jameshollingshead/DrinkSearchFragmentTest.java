package com.jameshollingshead;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.robolectric.util.FragmentTestUtil.startFragment;

/**
 * Created by jhollingshead on 4/29/15.
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class DrinkSearchFragmentTest {

    @Test
    public void testDrinkSearchFragmentExists() throws Exception {
        DrinkSearchFragment fragment = new DrinkSearchFragment();
        startFragment(fragment);
        assertNotNull(fragment);
    }

//    @Test
//    public void testDrinkSearchFragmentContainsSearchField() throws Exception {
//        DrinkSearchFragment fragment = new DrinkSearchFragment();
//        startFragment(fragment);
//
//        assertEquals(R.id.drink_search_search_box, Robolectric.shadowOf(fragment).);
//
//
////        Activity activity = Robolectric.buildActivity(MainActivity.class)
////                .create()
////                .start()
////                .resume()
////                .get();
//    }

// This uses a different version?
//    public static void startFragment(Fragment fragment) {
//        FragmentManager fragmentManager = new FragmentActivity().getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.add(fragment, null);
//        fragmentTransaction.commit();
//    }
}
