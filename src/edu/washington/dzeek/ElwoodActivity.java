package edu.washington.dzeek;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

public class ElwoodActivity extends Activity
        implements OnClickListener {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button button = (Button)findViewById(R.id.activity_switch);
        button.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent i = new Intent(this, ElwoodText.class);
        startActivity(i);
    }
}
