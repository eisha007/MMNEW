package com.example.marchmadness;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

    public class MainActivity extends Activity {
        //implements AdapterView.OnItemSelectedListener {

        TextView showInfo;

        Spinner spinner;
        //String players[] = {"1. Cassius Winston", "2. Markus Howard", "3. Myles Powell", "4. James Wiseman",
        //"5. Cole Anthony", "6. Jordan Nwora", "7. Kerry Blackshear", "8. Tre Jones", "9. Anthony Cowan Jr.",
        // "10. Lamar Stevens", "11. Anthony Edwards", "12. Devon Dotson", "13. Jarron Cumberland", "14. Udoka Azubuike",
        //"15. Kaleb Wesson", "16. Sam Merrill", "17. Tristan Clark", "18. Jalen Smith", "19. Trevion Williams", "20. Xavier Tillman"};

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }


        public void start20(View v) {
            Intent top20 = new Intent(this, Top20.class);
            startActivity(top20);
        }

        public void backHome(View v){
            Intent home = new Intent(this, MainActivity.class);
            startActivity(home);
        }

        public void startTest(View v){
            Intent test = new Intent(this, Test.class);
            startActivity(test);
        }
        public void startWho(View v){
            Intent who = new Intent(this, WhoLike.class);
            startActivity(who);
        }
    }