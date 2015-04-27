package com.jameshollingshead;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;


public class MainActivity extends Activity {
    @Inject Foo fooObject;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
      ((MainApplication) getApplication()).inject(this);
    setContentView(R.layout.activity_main);


      TextView t = new TextView(this);

      t = (TextView)findViewById(R.id.text);
      String injectedText = fooObject.provideText();

      t.setText(injectedText);
  }
}
