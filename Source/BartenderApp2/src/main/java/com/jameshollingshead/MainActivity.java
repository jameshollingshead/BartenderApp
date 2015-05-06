package com.jameshollingshead;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.jameshollingshead.helpers.FragmentUtilities;


public class MainActivity extends FragmentActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


      //Create new fragment to be placed in the layout.
      FragmentUtilities.insertFragmentIntoLayout(new DrinkSearchFragment(),
              "DrinkSearchFragment", R.id.activity_main, this);
  }


    @Override
    protected void onResume() {
        super.onResume();
        Button searchButton = (Button) findViewById(R.id.drink_search_search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SearchResultsActivity.class);
                startActivity(i);
            }
        });
    }
}
