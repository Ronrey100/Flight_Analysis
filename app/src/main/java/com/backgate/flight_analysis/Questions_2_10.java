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
import android.widget.Toast;


public class Questions_2_10 extends ActionBarActivity{

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
    public String answers_all[]=new String[33];
    public String values_all[]=new String[33];

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
        button1.setText(R.string.option_text_1_10);
        textView_Option1.setText(R.string.performance);
        button2.setText(R.string.option_text_2_10);
        textView_Option2.setText(R.string.temporal_demand);

        for(int i=0; i<15; i++){
            if("-1".equals(questions_mix_2[i])){
                question_val= questions_mix[i];
                inc= i;
                //System.out.println("You are at question_2_10 "+questions_mix[i]+", "+i);
                break;
            }
        }

        //System.out.println("You are at question_2_10 "+question_val+", "+inc);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        if(question_val.equals("-1")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(getApplicationContext(), Processing.class);
                        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        //Intent myIntent = new Intent(Questions_2_10.this, Processing.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        startActivity(myIntent);////finish();
                    }
                }
            });
        }

        if(question_val.equals("0")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_0.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
                }
            });
        }

        if(question_val.equals("1")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_1.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
                }
            });
        }

        if(question_val.equals("2")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_2.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
                }
            });
        }

        if(question_val.equals("3")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_3.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
                }
            });
        }

        if(question_val.equals("4")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_4.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
                }
            });
        }

        if(question_val.equals("5")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_5.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
                }
            });
        }

        if(question_val.equals("6")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_6.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
                }
            });
        }

        if(question_val.equals("8")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_8.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
                }
            });
        }

        if(question_val.equals("9")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_9.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
                }
            });
        }

        if(question_val.equals("7")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_7.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
                }
            });
        }

        if(question_val.equals("11")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_11.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
                }
            });
        }

        if(question_val.equals("12")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_12.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
                }
            });
        }

        if(question_val.equals("13")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_13.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
                }
            });
        }

        if(question_val.equals("14")) {
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!button1.isChecked() && !button2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Please select one of the options provided above.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Intent myIntent = new Intent(Questions_2_10.this, Questions_2_14.class);
                        if (button1.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Performance";
                                }
                            }
                        } else if (button2.isChecked()) {
                            for (int i = 0; i < 33; i++) {
                                if ("perf_temp".equals(answers_all[i])) {
                                    values_all[i] = "Temporal Demand";
                                }
                            }
                        }
                        questions_mix_2[inc] = "1";
                        myIntent.putExtra("string-array", questions_mix);
                        myIntent.putExtra("string-array-1", questions_mix_1);
                        myIntent.putExtra("string-array-2", questions_mix_2);
                        myIntent.putExtra("string-array-ans-text", answers_all);
                        myIntent.putExtra("string-array-ans-vals", values_all);
                        Questions_2_10.this.startActivity(myIntent);//finish();
                    }
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

    /*@Override
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
        if (id == R.id.action_exit) {
            int process_id= android.os.Process.myPid();
            android.os.Process.killProcess(process_id);
        }

        return super.onOptionsItemSelected(item);
    }*/

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
