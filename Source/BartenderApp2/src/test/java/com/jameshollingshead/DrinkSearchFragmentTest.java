package com.jameshollingshead;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

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
}
