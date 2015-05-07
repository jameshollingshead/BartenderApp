package com.jameshollingshead;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static android.view.View.OnClickListener;

/**
 * Created by jhollingshead on 4/29/15.
 */
public class DrinkSearchFragment extends Fragment implements OnClickListener{
    public DrinkSearchSetup drinkSearchSetup;
    public Button drinkSearchButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_drinksearch, container, false);

        return view;

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            drinkSearchSetup = (DrinkSearchSetup) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement DrinkSearchInterface");
        }

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        drinkSearchButton = (Button) getActivity().findViewById(R.id.drink_search_search_button);
        drinkSearchButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(getActivity().getApplicationContext(), SearchResultsActivity.class);
        startActivity(i);
    }
}
