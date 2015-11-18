package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spotify(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my spotify streamer app!",Toast.LENGTH_SHORT).show();
    }

    public void scores(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my scores app!",Toast.LENGTH_SHORT).show();
    }

    public void library(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my library app!",Toast.LENGTH_SHORT).show();
    }

    public void bigger(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my build it bigger app!",Toast.LENGTH_SHORT).show();
    }

    public void xyz(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my xyz reader app!",Toast.LENGTH_SHORT).show();
    }

    public void capstone(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my capstone app!",Toast.LENGTH_SHORT).show();
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
}
