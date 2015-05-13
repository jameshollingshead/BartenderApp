package com.jameshollingshead;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jameshollingshead.R;

import static android.view.View.OnClickListener;
/**
 * Created by jhollingshead on 5/13/15.
 */
public class DrinkRecipeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_drink_recipe, container, false);

        return view;
    }
}
