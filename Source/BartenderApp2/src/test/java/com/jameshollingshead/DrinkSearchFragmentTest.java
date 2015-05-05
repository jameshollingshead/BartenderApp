package com.jameshollingshead;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
 * Created by jhollingshead on 4/29/15.
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class DrinkSearchFragmentTest {


    @Test
    public void drinkSearchFragmentIsNotNull() throws Exception {
        DrinkSearchFragment fragment = new DrinkSearchFragment();
        startFragment(fragment);
        assertNotNull(fragment);
    }

    @Test
    public void drinkSearchFragmentContainsDrinkSearchLabel() throws Exception {
        Activity activity = Robolectric.buildActivity(MainActivity.class)
                .create().start().resume().visible().get();
        assertNotNull(activity);

        TextView textView = (TextView) activity.findViewById(R.id.drink_search_label);
        assertNotNull(textView);
    }

    @Test
    public void drinkSearchFragmentContainsEditableDrinkSearchTextBox() throws Exception {
        Activity activity = Robolectric.buildActivity(MainActivity.class)
                .create().start().resume().visible().get();
        assertNotNull(activity);

        EditText editText = (EditText) activity.findViewById(R.id.drink_search_text_box);
        assertNotNull(editText);
    }

    @Test
    public void drinkSearchFragmentContainsSearchButton() throws Exception {
        Activity activity = Robolectric.buildActivity(MainActivity.class)
                .create().start().resume().visible().get();
        assertNotNull(activity);

        Button searchButton = (Button) activity.findViewById(R.id.drink_search_search_button);
        assertNotNull(searchButton);
    }


}
