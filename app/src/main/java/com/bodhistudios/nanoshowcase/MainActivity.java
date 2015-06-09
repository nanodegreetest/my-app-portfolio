package com.bodhistudios.nanoshowcase;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int[] button_ids = {R.id.button_spotify_streamer, //
            R.id.button_scores_app, //
            R.id.button_library_app, //
            R.id.button_build_it_bigger, //
            R.id.button_xyz_reader, //
            R.id.button_capstone};

    String[] button_toasts = {"This button will launch my spotify streamer",
            "This button will launch my scores app",
            "This button will launch my library app",
            "This button will launch my build it bigger app",
            "This button will launch my xyz reader",
            "This button will launch my capstone",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < button_ids.length; i++) {
            Button b = (Button) findViewById(button_ids[i]);
            b.setOnClickListener(this);
            b.setTag(i);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int i = (Integer)v.getTag();
        Toast.makeText(this, button_toasts[i], Toast.LENGTH_SHORT).show();

    }
}
