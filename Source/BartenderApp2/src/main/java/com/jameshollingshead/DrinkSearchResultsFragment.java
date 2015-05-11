package com.jameshollingshead;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by jhollingshead on 5/11/15.
 */
public class DrinkSearchResultsFragment extends Fragment {

    ListView listView;
    String[] drinkNamesList;
    String[] defaultDrinkNames = new String[] {"Foo", "Bar", "Bot", "Baz"};

    DrinkSearchResultsFragment()
    {
        drinkNamesList = defaultDrinkNames;
    }

    public DrinkSearchResultsFragment(String[] drinkList)
    {
        drinkNamesList = drinkList;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_drink_search_results, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listView = (ListView) getActivity().findViewById(R.id.drink_list_view);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_expandable_list_item_1, android.R.id.text1, drinkNamesList);

        listView.setAdapter(arrayAdapter);
    }
}
