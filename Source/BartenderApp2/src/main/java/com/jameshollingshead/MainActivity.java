package com.jameshollingshead;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.jameshollingshead.helpers.FragmentUtilities;


public class MainActivity extends FragmentActivity
        implements DrinkSearchSetup {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    addDrinkSearch();
  }

    @Override
    public void addDrinkSearch() {
        FragmentUtilities.insertFragmentIntoLayout(new DrinkSearchFragment(),
                "DrinkSearchFragment", R.id.activity_main, this);
    }
}
