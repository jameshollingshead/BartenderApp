package com.jameshollingshead;

import com.jameshollingshead.MainActivity;
import com.jameshollingshead.R;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
public class MainEspressoTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainEspressoTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }



    public void testMainActivityWindowHasSearchButton() throws InterruptedException{
        onView(withId(R.id.drink_search_search_button)).check(matches(withText("Search")));
    }

    public void testMainActivityWindowHasSearchLabel() throws InterruptedException {
        onView(withId(R.id.drink_search_label)).check(matches(withText("Search for drink by name")));
    }
}
