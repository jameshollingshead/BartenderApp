package com.jameshollingshead.helpers;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jameshollingshead.DrinkSearchFragment;
import com.jameshollingshead.MainActivity;
import com.jameshollingshead.R;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.robolectric.util.FragmentTestUtil.startFragment;

/**
 * Created by jhollingshead on 5/6/15.
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class FragmentUtilitiesTest {

    String drinkSearchFragmentTag = "DrinkSearchFragment";

    @Test
    public void insertFragmentIntoLayoutInsertsFragment() throws Exception {
        FragmentActivity activity = Robolectric.buildActivity(MainActivity.class).create().get();

        FragmentUtilities.insertFragmentIntoLayout(new DrinkSearchFragment(), drinkSearchFragmentTag,
                R.id.activity_main, activity);

        DrinkSearchFragment drinkSearchFragment = (DrinkSearchFragment) ((FragmentActivity) activity)
                .getSupportFragmentManager()
                .findFragmentById(R.id.activity_main);

        assertEquals(drinkSearchFragmentTag, drinkSearchFragment.getTag());
    }
}
