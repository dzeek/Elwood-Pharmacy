package edu.washington.dzeek;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class ElwoodHome extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button button = (Button)findViewById(R.id.activity_switch);
        button.setOnClickListener(new View.OnClickListener() {
               public void onClick(View view) {
                  Intent i = new Intent(ElwoodHome.this, ElwoodText.class);
                  startActivity(i);
               }
           });
    }
}
