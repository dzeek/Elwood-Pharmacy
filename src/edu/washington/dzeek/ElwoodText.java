/**
 * 
 */
package edu.washington.dzeek;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;
import android.content.res.Resources;

import java.util.Random;
import java.lang.reflect.Array;

/**
 * @author don
 *
 */
public class ElwoodText extends Activity
         implements View.OnClickListener {


   @Override
   public void onCreate(Bundle bundle_in) {
      super.onCreate(bundle_in);
      setContentView(R.layout.main_text);

      Resources res = getResources();
      String[] phrases = res.getStringArray(R.array.homework_phrases);
      int nPhrases = Array.getLength(phrases);
      Random picker = new Random();
      int phrasePick = picker.nextInt(nPhrases);

      String phraseChoice = phrases[phrasePick];
      // String phraseChoice = "better luck at 6:17?";

      TextView tv = (TextView) findViewById(R.id.randotext);
      // tv.setText("Hiccup, Android");
      tv.setText(phraseChoice);

      Button bQuit = (Button) findViewById(R.id.quit_button);
      bQuit.setOnClickListener(new View.OnClickListener() {
              public void onClick(View arg0) {
                  // finish();
                  // System.exit(0);
                  int pid = android.os.Process.myPid();
                  android.os.Process.killProcess(pid);
              }
          });
      Button bHome = (Button) findViewById(R.id.home_button);
      bHome.setOnClickListener(this);
   }

   public void onClick(View arg0) {
       Intent i = new Intent(ElwoodText.this, ElwoodActivity.class);
       startActivity(i);
   }
}
