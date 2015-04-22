package com.jameshollingshead.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.jameshollingshead.DeckardApplication;
import com.jameshollingshead.DummyModule;
import com.jameshollingshead.R;

import javax.inject.Inject;

import dagger.ObjectGraph;

public class DeckardActivity extends Activity {
    //@Inject DummyModule dummyModule;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.deckard);

      ((DeckardApplication) getApplication()).inject(this);
      TextView t = new TextView(this);

      t = (TextView)findViewById(R.id.text);
      //String injectedText =

      t.setText("foo");
  }
}
