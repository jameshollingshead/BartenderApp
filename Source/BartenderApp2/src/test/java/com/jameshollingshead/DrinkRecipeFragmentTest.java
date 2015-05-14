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
 * Created by jhollingshead on 5/13/15.
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class DrinkRecipeFragmentTest {

    @Test
    public void drinkRecipeFragmentIsNotNull() throws Exception {

        Activity activity = Robolectric.buildActivity(DrinkRecipeActivity.class)
                .create().start().resume().visible().get();
        assertNotNull(activity);
        DrinkRecipeFragment drinkRecipeFragment = (DrinkRecipeFragment) ((FragmentActivity) activity)
                .getSupportFragmentManager()
                .findFragmentById(R.id.activity_drink_recipe);
        assertNotNull(drinkRecipeFragment);
    }

    @Test
    public void drinkRecipeFragmentContainsDrinkNameLabel() throws Exception {
        Activity activity = Robolectric.buildActivity(DrinkRecipeActivity.class)
                .create().start().resume().visible().get();
        assertNotNull(activity);
        TextView drinkNameLabel = (TextView) activity.findViewById(R.id.drink_name_label);
        assertNotNull(drinkNameLabel);
    }

    @Test
    public void drinkRecipeFragmentContainsDrinkIngredientsLabel() throws Exception {
        Activity activity = Robolectric.buildActivity(DrinkRecipeActivity.class)
                .create().start().resume().visible().get();
        assertNotNull(activity);
        TextView drinkIngredientsLabel = (TextView) activity.findViewById(R.id.drink_ingredients_label);
        assertNotNull(drinkIngredientsLabel);
    }

    @Test
    public void drinkRecipeFragmentContainsDrinkInstructionsLabel() throws Exception {
        Activity activity = Robolectric.buildActivity(DrinkRecipeActivity.class)
                .create().start().resume().visible().get();
        assertNotNull(activity);
        TextView drinkInstructionsLabel = (TextView) activity.findViewById(R.id.drink_instructions_label);
        assertNotNull(drinkInstructionsLabel);
    }

}
