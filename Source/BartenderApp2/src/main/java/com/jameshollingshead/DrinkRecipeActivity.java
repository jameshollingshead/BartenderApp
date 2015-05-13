package com.jameshollingshead;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.jameshollingshead.helpers.FragmentUtilities;

/**
 * Created by jhollingshead on 5/13/15.
 */
public class DrinkRecipeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_recipe);

        FragmentUtilities.insertFragmentIntoLayout(new DrinkRecipeFragment(),
                "DrinkRecipeFragment", R.id.activity_drink_recipe, this);
    }
}
