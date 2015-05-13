package com.jameshollingshead;

    import android.app.Activity;
    import android.support.v4.app.FragmentActivity;

    import org.junit.Assert;
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
 * Created by jhollingshead on 5/13/15.
 */

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class DrinkRecipeActivityTest {

    String drinkRecipeFragmentTag = "DrinkRecipeFragment";

    @Test
    public void drinkRecipeActivityIsNotNull() throws Exception {
        org.junit.Assert.assertTrue(Robolectric.buildActivity(DrinkRecipeActivity.class).create().get() != null);
    }

    @Test
    public void drinkRecipeActivityUsesActivityDrinkRecipeAsTheContentView () throws Exception {
        Activity activity = Robolectric.buildActivity(DrinkRecipeActivity.class).create().get();

        org.junit.Assert.assertEquals(R.id.activity_drink_recipe, Robolectric.shadowOf(activity).getContentView().getId());
    }

    @Test
    public void theContentViewActivityDrinkRecipeContainsDrinkRecipeFragment() throws Exception {

        Activity activity = Robolectric.buildActivity(DrinkRecipeActivity.class)
                .create().start().resume().visible().get();

        DrinkRecipeFragment drinkRecipeFragment = (DrinkRecipeFragment) ((FragmentActivity) activity)
                .getSupportFragmentManager()
                .findFragmentById(R.id.activity_drink_recipe);

        Assert.assertNotNull("Fragment should have existed", drinkRecipeFragment);

        Assert.assertEquals(drinkRecipeFragmentTag, drinkRecipeFragment.getTag());
    }
}
