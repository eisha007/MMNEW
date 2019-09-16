package com.example.marchmadness;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class WhoLike extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_like);
        addListenerOnButton();
    }


    public void addListenerOnButton() {
        CheckBox check1 = findViewById(R.id.checkBox1);
        CheckBox check2 = findViewById(R.id.checkBox2);
        CheckBox check3 = findViewById(R.id.checkBox3);
        CheckBox check4 = findViewById(R.id.checkBox4);
        CheckBox check5 = findViewById(R.id.checkBox5);
        CheckBox check6 = findViewById(R.id.checkBox6);
        CheckBox check7 = findViewById(R.id.checkBox7);
        CheckBox check8 = findViewById(R.id.checkBox8);
        CheckBox check9 = findViewById(R.id.checkBox9);
        CheckBox check10 = findViewById(R.id.checkBox10);
        Button checkAnswers = (Button) findViewById(R.id.checkTF);
        checkAnswers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                CheckBox check1 = findViewById(R.id.checkBox1);
                CheckBox check2 = findViewById(R.id.checkBox2);
                CheckBox check3 = findViewById(R.id.checkBox3);
                CheckBox check4 = findViewById(R.id.checkBox4);
                CheckBox check5 = findViewById(R.id.checkBox5);
                CheckBox check6 = findViewById(R.id.checkBox6);
                CheckBox check7 = findViewById(R.id.checkBox7);
                CheckBox check8 = findViewById(R.id.checkBox8);
                CheckBox check9 = findViewById(R.id.checkBox9);
                CheckBox check10 = findViewById(R.id.checkBox10);
                int pointsRight = 0;
                if (check1.isChecked()== false &&check2.isChecked()== false &&check3.isChecked()== false &&check4.isChecked()== false &&
                        check5.isChecked()== false &&check6.isChecked()== false &&check6.isChecked()== false &&check7.isChecked()== false &&
                        check8.isChecked()== false &&check9.isChecked()== false &&check10.isChecked()== false ){
                    Toast.makeText(WhoLike.this,"Come on man! Dont cheat and get the default points!", Toast.LENGTH_SHORT).show();
                }

                else {
                    if (check1.isChecked() == false) {
                        pointsRight++;
                    }
                    if (check2.isChecked() == false) {
                        pointsRight++;
                    }

                    if (check3.isChecked()) {
                        pointsRight++;
                    }
                    if (check4.isChecked()) {
                        pointsRight++;
                    }
                    if (check5.isChecked()) {
                        pointsRight++;
                    }
                    if (check6.isChecked()) {
                        pointsRight++;
                    }
                    if (check7.isChecked() == false) {
                        pointsRight++;
                    }
                    if (check8.isChecked() == false) {
                        pointsRight++;
                    }
                    if (check9.isChecked()) {
                        pointsRight++;
                    }
                    if (check10.isChecked()) {
                        pointsRight++;
                    }

                    TextView t = (TextView) findViewById(R.id.tfView);
                    t.setText("You got " + pointsRight + "/10 points!");
                    t.setBackgroundColor(Color.CYAN);
                }

    }
    }
    );

    }
}
