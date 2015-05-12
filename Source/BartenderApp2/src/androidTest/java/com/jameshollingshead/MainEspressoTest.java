package com.jameshollingshead;

import com.jameshollingshead.MainActivity;
import com.jameshollingshead.R;

import android.support.test.espresso.Espresso;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.widget.NumberPicker;

import org.hamcrest.core.IsInstanceOf;

import java.lang.InterruptedException;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

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

    public void testMainActivityWindowExists() throws InterruptedException {
        onView(withId(R.id.activity_main))
                .check(matches(isDisplayed()));
    }

    public void testMainActivityWindowHasSearchButton() throws InterruptedException{
        onView(withId(R.id.drink_search_search_button)).check(matches(withText("Search")));
    }

    public void testMainActivityWindowHasSearchLabel() throws InterruptedException {
        onView(withId(R.id.drink_search_label)).check(matches(withText("Search for drink by name")));
    }

    public void testClickingSearchButtonOnDrinkSearchPageOpensSearchResultsPage()
            throws InterruptedException {
        onView(withId(R.id.drink_search_search_button)).perform(click());

        onView(withId(R.id.activity_search_results))
                .check(matches(isDisplayed()));
    }

    public void testSearchResultsPageContainsDrinkSearchResultsFragment()
        throws InterruptedException {
        onView(withId(R.id.drink_search_search_button)).perform(click());

        onView(withId(R.id.fragment_drink_search_results))
                .check(matches(isDisplayed()));
    }

    public void testSearchResultsPageContainsAListViewOfElements()
        throws InterruptedException {
        onView(withId(R.id.drink_search_search_button)).perform(click());

        onView(withId(R.id.drink_list_view))
                .check(matches(isDisplayed()));
    }

    public void testSearchResultsPageContainsFoo2Bar2Bot2Baz2InListView()
        throws InterruptedException {
        onView(withId(R.id.drink_search_search_button)).perform(click());

       onData(instanceOf(String.class))
                .inAdapterView(withId(R.id.drink_list_view))
                .atPosition(0)
                .check(matches(withText("Foo2")));
        onData(instanceOf(String.class))
                .inAdapterView(withId(R.id.drink_list_view))
                .atPosition(1)
                .check(matches(withText("Bar2")));
        onData(instanceOf(String.class))
                .inAdapterView(withId(R.id.drink_list_view))
                .atPosition(2)
                .check(matches(withText("Bot2")));
        onData(instanceOf(String.class))
                .inAdapterView(withId(R.id.drink_list_view))
                .atPosition(3)
                .check(matches(withText("Baz2")));
    }

    public void testClickingBackFromSearchResultsReturnsYouToSearchPage()
        throws InterruptedException {
        onView(withId(R.id.drink_search_search_button)).perform(click());
        onView(withId(R.id.activity_search_results)).check(matches(isDisplayed()));
        Espresso.pressBack();

        onView(withId(R.id.activity_main)).check(matches(isDisplayed()));
    }
}
