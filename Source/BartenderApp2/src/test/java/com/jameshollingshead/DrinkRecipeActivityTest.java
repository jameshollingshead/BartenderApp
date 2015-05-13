package com.jameshollingshead;

    import android.app.Activity;
    import android.app.Fragment;
    import android.app.FragmentManager;
    import android.app.FragmentTransaction;
    import android.support.v4.app.FragmentActivity;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.ListView;
    import android.widget.TextView;

    import junit.framework.Assert;

    import org.junit.Before;
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

    @Test
    public void drinkRecipeActivityIsNotNull() throws Exception {
        org.junit.Assert.assertTrue(Robolectric.buildActivity(DrinkRecipeActivity.class).create().get() != null);
    }

    @Test
    public void drinkRecipeActivityUsesActivityDrinkRecipeAsTheContentView () throws Exception {
        Activity activity = Robolectric.buildActivity(DrinkRecipeActivity.class).create().get();

        org.junit.Assert.assertEquals(R.id.activity_drink_recipe, Robolectric.shadowOf(activity).getContentView().getId());
    }
}
