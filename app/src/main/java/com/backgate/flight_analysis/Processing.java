package com.backgate.flight_analysis;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class Processing extends ActionBarActivity {

    public String answers_all[]=new String[30];
    public String values_all[]=new String[30];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.processing);
        answers_all = getIntent().getStringArrayExtra("string-array-ans-text");
        values_all = getIntent().getStringArrayExtra("string-array-ans-vals");

        for(int i=0; i<30; i++){
            System.out.println(answers_all[i]+", "+values_all[i]);
        }

        initializeVariables();
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

    // A private method to help us initialize our variables.
    private void initializeVariables() {
    }
}
