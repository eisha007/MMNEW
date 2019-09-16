package com.example.marchmadness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends AppCompatActivity {
    RadioGroup group1;
    RadioGroup group2;
    RadioGroup group3;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        RadioButton zion = (RadioButton) findViewById(R.id.zion);
        RadioButton tacko = (RadioButton) findViewById(R.id.tacko);
        RadioButton kyle = (RadioButton) findViewById(R.id.kyle);
        RadioButton rj = (RadioButton) findViewById(R.id.rj);
        RadioButton villanova = (RadioButton) findViewById(R.id.villanova);
        RadioButton virginia = (RadioButton) findViewById(R.id.virginia);
        RadioButton duke = (RadioButton) findViewById(R.id.duke);
        RadioButton gonzaga = (RadioButton) findViewById(R.id.gonzaga);
        RadioButton good = (RadioButton) findViewById(R.id.True);
        RadioButton bad = (RadioButton) findViewById(R.id.False);
        addListenerOnButton();

    }

    public void backHome(View v){
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
    }
    public void addListenerOnButton() {

        group1 = (RadioGroup) findViewById(R.id.group1);
        group2 = (RadioGroup) findViewById(R.id.group2);
        group3 = (RadioGroup) findViewById(R.id.group3);
        final int id1 = group1.getCheckedRadioButtonId();
        final int id2 = group2.getCheckedRadioButtonId();
        final int id3 = group3.getCheckedRadioButtonId();
        Button button = (Button) findViewById(R.id.check2);
            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    //Toast t = new Toast(getApplicationContext());
                    // get selected radio button from radioGroup

                    // find the radiobutton by returned id
                    int selectedId = group1.getCheckedRadioButtonId();
                    int selectedId2 = group2.getCheckedRadioButtonId();
                    int selectedId3 = group3.getCheckedRadioButtonId();
                    radioButton1 = (RadioButton) findViewById(selectedId);
                    radioButton2 = (RadioButton) findViewById(selectedId2);
                    radioButton3 = (RadioButton) findViewById(selectedId3);

                    if (radioButton1 == null || radioButton2 == null || radioButton3 == null) {
                        Toast empty = Toast.makeText(Test.this, "PLEASE ANSWER ALL QUESTIONS", Toast.LENGTH_SHORT);
                        TextView t6 = (TextView) empty.getView().findViewById(android.R.id.message);
                        t6.setBackgroundColor(Color.YELLOW);
                        empty.show();
                    } else {
                        String radioButton1Text = radioButton1.getText().toString();
                        String radioButton2Text = radioButton2.getText().toString();
                        String radioButton3Text = radioButton3.getText().toString();

                            if (!radioButton1Text.isEmpty() || !radioButton2Text.isEmpty() || !radioButton3Text.isEmpty()) {

                            if (radioButton1.getText().equals("Kyle Guy") && radioButton2.getText().equals("Virginia")
                                    && radioButton3.getText().equals("True")) {
                                Toast toast3 = Toast.makeText(Test.this, "100% CORRECT!!", Toast.LENGTH_SHORT);
                                TextView t3 = (TextView) toast3.getView().findViewById(android.R.id.message);
                                t3.setBackgroundColor(Color.GREEN);
                                toast3.show();
                            } else if (radioButton1.getText().equals("Kyle Guy") || radioButton2.getText().equals("Virginia")
                                    || radioButton3.getText().equals("True")) {
                                Toast toast = Toast.makeText(Test.this, "NOT QUITE BUT ALMOST THERE!! YOU HAVE AT LEAST ONE CORRECT ANSWER!"
                                        , Toast.LENGTH_SHORT);
                                TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
                                t.setBackgroundColor(Color.MAGENTA);
                                toast.show();
                            } else if (radioButton1.getText().equals("Kyle Guy") == false && radioButton2.getText().equals("Virginia") == false
                                    && radioButton3.getText().equals("True") == false) {

                                Toast toast2 = Toast.makeText(Test.this, "ALL YOUR ANSWERS (AS OF NOW) ARE WRONG! TRY AGAIN", Toast.LENGTH_SHORT);
                                TextView r = (TextView) toast2.getView().findViewById(android.R.id.message);
                                r.setBackgroundColor(Color.RED);
                                toast2.show();
                            }
                        }

                    }
                }

            });
    }

}


