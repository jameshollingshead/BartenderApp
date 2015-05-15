package com.jameshollingshead;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.jameshollingshead.R;

import static android.view.View.OnClickListener;
/**
 * Created by jhollingshead on 5/13/15.
 */
public class DrinkRecipeFragment extends Fragment {

    String fooIngredients = "One \n" +
            "Two \n" +
            "Three \n" +
            "Four";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_drink_recipe, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView ingredients = new TextView(this.getActivity());
        ingredients = (TextView)this.getActivity().findViewById(R.id.drink_ingredients_label);
        ingredients.setText(fooIngredients);

        TextView instructions = (TextView)this.getActivity().findViewById(R.id.drink_instructions_label);
        String fooInstructions = "";

        for(int i = 0; i < 50; i++)
        {
            fooInstructions = fooInstructions + Integer.toString(i) + "\n";
        }

        instructions.setText(fooInstructions);
    }
}
