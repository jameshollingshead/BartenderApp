package com.jameshollingshead.helpers;


import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;
/**
 * Created by jhollingshead on 5/6/15.
 */
public final class FragmentUtilities {

    private FragmentUtilities(){}

    public static void insertFragmentIntoLayout(Fragment fragment, String tag, int layout, FragmentActivity activity) {

        activity.getSupportFragmentManager().beginTransaction()
                .add(layout, fragment, tag).commit();
    }
}
