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
import android.widget.Button;

import junit.framework.Assert;


/**
 * Created by jhollingshead on 5/5/15.
 */

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class SearchResultsActivityTest {

    @Test
    public void searchResultsActivityIsNotNull() throws Exception {
        assertTrue(Robolectric.buildActivity(SearchResultsActivity.class).create().get() != null);
    }

    @Test
    public void  searchResultsActivityUsesActivitySearchResultsAsTheContentView() throws Exception {
        Activity activity = Robolectric.buildActivity(SearchResultsActivity.class).create().get();

        assertEquals(R.id.activity_search_results, Robolectric.shadowOf(activity).getContentView().getId());
    }

}
