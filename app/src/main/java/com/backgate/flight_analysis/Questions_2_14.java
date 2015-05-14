package com.backgate.flight_analysis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class Questions_2_14 extends ActionBarActivity{

    private TextView textView_Quest;
    private TextView textView_Option1;
    private TextView textView_Option2;
    private RadioButton button1;
    private RadioButton button2;
    private Button prev_button;
    private Button next_button;
    public String questions_mix[]=new String[15];
    public String questions_mix_1[]=new String[15];
    public String questions_mix_2[]=new String[15];
    public String question_val="-1";
    public int inc=-1;
    public String answers_all[]=new String[30];
    public String values_all[]=new String[30];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions_2);

        initializeVariables();
        questions_mix = getIntent().getStringArrayExtra("string-array");
        questions_mix_1 = getIntent().getStringArrayExtra("string-array-1");
        questions_mix_2 = getIntent().getStringArrayExtra("string-array-2");
        answers_all = getIntent().getStringArrayExtra("string-array-ans-text");
        values_all = getIntent().getStringArrayExtra("string-array-ans-vals");
        textView_Quest.setText(R.string.question_text);
        button1.setText(R.string.option_text_1_14);
        textView_Option1.setText(R.string.frustration);
        button2.setText(R.string.option_text_2_14);
        textView_Option2.setText(R.string.mental_demand);

        for(int i=0; i<15; i++){
            if("-1".equals(questions_mix_2[i])){
                question_val= questions_mix[i];
                inc= i;
                break;
            }
        }

        System.out.println(question_val+", "+inc);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        for(int i=0; i<30; i++){
            System.out.println(answers_all[i]+", "+values_all[i]);
        }

        if(question_val.equals("-1")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Processing.class);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("0")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_0.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("1")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_1.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("2")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_2.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("3")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_3.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("4")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_4.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("5")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_5.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("6")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_6.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("8")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_8.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("9")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_9.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("10")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_10.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("11")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_11.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("12")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_12.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("13")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_13.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        if(question_val.equals("7")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Questions_2_14.this, Questions_2_7.class);
                    if(button1.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Frustration";
                            }
                        }
                    } else if(button2.isChecked()) {
                        for(int i=0; i<30; i++){
                            if("frus_ment".equals(answers_all[i])){
                                values_all[i]= "Mental Demand";
                            }
                        }
                    }
                    questions_mix_2[inc]="1";
                    myIntent.putExtra("string-array", questions_mix);
                    myIntent.putExtra("string-array-1", questions_mix_1);
                    myIntent.putExtra("string-array-2", questions_mix_2);
                    myIntent.putExtra("string-array-ans-text", answers_all);
                    myIntent.putExtra("string-array-ans-vals", values_all);
                    Questions_2_14.this.startActivity(myIntent);
                }
            });
        }

        prev_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
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
        textView_Quest = (TextView) findViewById(R.id.question_text);
        textView_Option1 = (TextView) findViewById(R.id.option_1_text);
        textView_Option2 = (TextView) findViewById(R.id.option_2_text);
        prev_button = (Button) findViewById(R.id.prev_button);
        next_button = (Button) findViewById(R.id.next_button);
        button1= (RadioButton)findViewById(R.id.option_1);
        button2= (RadioButton)findViewById(R.id.option_2);
    }

}
