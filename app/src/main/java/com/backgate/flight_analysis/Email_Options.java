package com.backgate.flight_analysis;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Email_Options extends ActionBarActivity {

    String baseDir = Environment.getExternalStorageDirectory().getAbsolutePath();
    public String filePath;
    public TextView textView_attach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_opt);
        initializeVariables();
        filePath = baseDir + File.separator + "Flight_Analysis";

        List<File> files = getListFiles(new File(filePath));

        LinearLayout email_table = (LinearLayout) findViewById(R.id.rel_lay_email);
        //RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        //params.addRule(RelativeLayout.BELOW,R.id.attach_txt);
        for (int i = 0; i < files.size(); i++) {
            CheckBox file_names = new CheckBox(getApplicationContext());
            //file_names.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
            //file_names.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.BELOW, R.id.attach_txt));
            file_names.setId(i);
            file_names.setTextColor(getResources().getColor(R.color.black));
            file_names.setText(files.get(i).getName());
            email_table.addView(file_names);
            //params.addRule(RelativeLayout.BELOW,file_names.getId());
        }

        //LinearLayout button_lay = (LinearLayout)findViewById(R.id.buttonlayout);
        LinearLayout.LayoutParams button_lay = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button_lay.gravity = Gravity.CENTER_HORIZONTAL;
        Button email_sub_but = new Button(this);
        email_sub_but.setText("Send email");
        email_table.addView(email_sub_but, button_lay);
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

    private List<File> getListFiles(File parentDir) {
        ArrayList<File> inFiles = new ArrayList<File>();
        File[] files = parentDir.listFiles();
        for (File file : files) {
            if (file.getName().endsWith(".csv")) {
                inFiles.add(file);
            }
        }
        return inFiles;
    }

}
