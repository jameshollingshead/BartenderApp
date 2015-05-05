package com.jameshollingshead;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

import javax.inject.Inject;


public class MainActivity extends FragmentActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


      //Create new fragment to be placed in the layout.
      DrinkSearchFragment drinkSearchFragment = new DrinkSearchFragment();

      getSupportFragmentManager().beginTransaction()
              .add(R.id.activity_main, drinkSearchFragment, "DrinkSearchFragment").commit();



  }
}
