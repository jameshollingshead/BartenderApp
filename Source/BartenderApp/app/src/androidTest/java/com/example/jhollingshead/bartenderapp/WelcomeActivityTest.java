package com.example.jhollingshead.bartenderapp;

import android.content.Intent;
import android.provider.Contacts;

import org.junit.Test;
import org.junit.runner.RunWith;
//import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
//import org.robolectric.annotation.Config;
//import org.robolectric.TestRunners;


import static org.junit.Assert.assertThat;
import static org.robolectric.Robolectric.shadowOf;
//import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by jhollingshead on 4/14/15.
 */
//These are dummy tests

@RunWith(RobolectricTestRunner.class)

public class WelcomeActivityTest {

//    @Test
//    public void clickingLogin_shouldStartLoginActivity(){
//        WelcomeActivity activity = Robolectric.setupActivity(WelcomeActivity.class);
//        activity.findViewById(R.id.login).performClick();
//
//        Intent expectedIntent = new Intent(activity, WelcomeActivity.class);
//        assertThat(shadowOf(activity).getNextStartedActivity().isEqualTo(expectedIntent));
//    }

    @Test
    public void sanityTest(){
        assert(true == true);
    }
}
