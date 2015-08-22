package com.backgate.flight_analysis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class Optional_Activity extends ActionBarActivity {

    private Button button;
    private Button prev_button;
    private EditText first_name;
    private EditText middle_name;
    private EditText last_name;
    private EditText age_name;
    private RadioButton button1;
    private RadioButton button2;
    private EditText height_name;
    private EditText weight_name;
    private EditText flying_exp_name;
    private EditText organisation_name;
    private TextView next_act;
    public String questions_mix[]=new String[15];
    public String questions_mix_1[]=new String[15];
    public String questions_mix_2[]=new String[15];
    public String answers_all[]=new String[33];
    public String values_all[]=new String[33];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optional);
        initializeVariables();
        questions_mix = getIntent().getStringArrayExtra("string-array");
        questions_mix_1 = getIntent().getStringArrayExtra("string-array-1");
        questions_mix_2 = getIntent().getStringArrayExtra("string-array-2");
        answers_all = getIntent().getStringArrayExtra("string-array-ans-text");
        values_all = getIntent().getStringArrayExtra("string-array-ans-vals");
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        //Select a specific button to bundle it with the action you want
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent myIntent = new Intent(Optional_Activity.this, Questions_1.class);
                    for (int i = 0; i < 33; i++) {
                        if ("first_name".equals(answers_all[i])) {
                            values_all[i] = String.valueOf(first_name.getText());
                        }
                        if ("middle_name".equals(answers_all[i])) {
                            values_all[i] = String.valueOf(middle_name.getText());
                        }
                        if ("last_name".equals(answers_all[i])) {
                            values_all[i] = String.valueOf(last_name.getText());
                        }
                        if ("age".equals(answers_all[i])) {
                            values_all[i] = String.valueOf(age_name.getText());
                        }
                        if ("gender".equals(answers_all[i])) {
                            if (button1.isChecked()) {
                                values_all[i] = String.valueOf(button1.getText());
                            } else if (button2.isChecked()) {
                                values_all[i] = String.valueOf(button2.getText());
                            }
                        }
                        if ("height".equals(answers_all[i])) {
                            values_all[i] = String.valueOf(height_name.getText());
                        }
                        if ("weight".equals(answers_all[i])) {
                            values_all[i] = String.valueOf(weight_name.getText());
                        }
                        if ("fly_exp".equals(answers_all[i])) {
                            values_all[i] = String.valueOf(flying_exp_name.getText());
                        }
                        if ("organisation".equals(answers_all[i])) {
                            values_all[i] = String.valueOf(organisation_name.getText());
                        }
                    }
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Optional_Activity.this.startActivity(myIntent);
            }
        });

        next_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Optional_Activity.this, Questions_1.class);
                for (int i = 0; i < 33; i++) {
                    if ("first_name".equals(answers_all[i])) {
                        values_all[i] = String.valueOf(first_name.getText());
                    }
                    if ("middle_name".equals(answers_all[i])) {
                        values_all[i] = String.valueOf(middle_name.getText());
                    }
                    if ("last_name".equals(answers_all[i])) {
                        values_all[i] = String.valueOf(last_name.getText());
                    }
                    if ("age".equals(answers_all[i])) {
                        values_all[i] = String.valueOf(age_name.getText());
                    }
                    if ("gender".equals(answers_all[i])) {
                        if (button1.isChecked()) {
                            values_all[i] = String.valueOf(button1.getText());
                        } else if (button2.isChecked()) {
                            values_all[i] = String.valueOf(button2.getText());
                        }
                    }
                    if ("height".equals(answers_all[i])) {
                        values_all[i] = String.valueOf(height_name.getText());
                    }
                    if ("weight".equals(answers_all[i])) {
                        values_all[i] = String.valueOf(weight_name.getText());
                    }
                    if ("fly_exp".equals(answers_all[i])) {
                        values_all[i] = String.valueOf(flying_exp_name.getText());
                    }
                    if ("organisation".equals(answers_all[i])) {
                        values_all[i] = String.valueOf(organisation_name.getText());
                    }
                }
                myIntent.putExtra("string-array", questions_mix);
                myIntent.putExtra("string-array-1", questions_mix_1);
                myIntent.putExtra("string-array-2", questions_mix_2);
                myIntent.putExtra("string-array-ans-text", answers_all);
                myIntent.putExtra("string-array-ans-vals", values_all);
                Optional_Activity.this.startActivity(myIntent);
            }
            });

        prev_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    // A private method to help us initialize our variables.
    private void initializeVariables() {
        button = (Button) findViewById(R.id.next_button);
        prev_button=(Button)findViewById(R.id.prev_button);
        first_name=(EditText)findViewById(R.id.first_name_value);
        middle_name=(EditText)findViewById(R.id.middle_name_value);
        last_name=(EditText)findViewById(R.id.last_name_value);
        age_name=(EditText)findViewById(R.id.age_value);
        button1= (RadioButton)findViewById(R.id.radio_male);
        button2= (RadioButton)findViewById(R.id.radio_female);
        height_name=(EditText)findViewById(R.id.height_value);
        weight_name=(EditText)findViewById(R.id.weight_value);
        flying_exp_name=(EditText)findViewById(R.id.flying_exp_value);
        organisation_name=(EditText)findViewById(R.id.org_name_value);
        next_act=(TextView)findViewById(R.id.next_text);
    }
}
