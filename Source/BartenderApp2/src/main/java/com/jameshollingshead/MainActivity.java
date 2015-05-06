package com.jameshollingshead;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    @Override
    protected void onResume() {
        super.onResume();
        Button searchButton = (Button) findViewById(R.id.drink_search_search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), SearchResultsActivity.class);
                startActivity(i);
            }
        });
    }
}
