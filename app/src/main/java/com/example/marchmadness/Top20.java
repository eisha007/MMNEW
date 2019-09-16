package com.example.marchmadness;

import androidx.appcompat.app.AppCompatActivity;

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
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class Top20 extends AppCompatActivity implements OnItemSelectedListener{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top20);
        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.playersSpinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements

        String playArr[] = getResources().getStringArray(R.array.players_array);
        ArrayList<String> categories = new ArrayList<String>(Arrays.asList(playArr));

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
        TextView showInfo = (TextView) findViewById(R.id.showInfo);
        TextView imageStats = (TextView) findViewById(R.id.imageStats);
        if(item.equalsIgnoreCase("1. Cassius Winston")){
            showInfo.setText("RANK/NAME: " + item +"\nTEAM: Michigan State\nHEIGHT: 6'2\nWEIGHT: 194\nPOSITION: PG\nCLASS: Senior\nFT%: 84%" +
                    "\nFG%: 46%\nREB: 3.0\nAVG PPG: 18.8\nNUMBER: #5");
            imageStats.setCompoundDrawablesWithIntrinsicBounds(
                   0, R.drawable.cass, 0, 0 );
        }
        else if(item.equalsIgnoreCase("2. Markus Howard")){
            showInfo.setText("RANK/NAME: " + item +"\nTEAM: Marquette\nHEIGHT: 5'11\nWEIGHT: 175\nPOSITION: G\nCLASS: Senior\nFT%: 89%" +
                    "\nFG%: 42%\nREB: 4.0\nAVG PPG: 25.0\nNUMBER: #0");
            imageStats.setCompoundDrawablesWithIntrinsicBounds(
                    0, R.drawable.mark, 0, 0 );
        }
        else if(item.equalsIgnoreCase("3. Myles Powell")){
            showInfo.setText("RANK/NAME: " + item +"\nTEAM: Seton Hall\nHEIGHT: 6'2\nWEIGHT: 195\nPOSITION: PG/G\nCLASS: Senior\nFT%: 84%" +
                    "\nFG%: 44.7%\nREB: 4.0\nAVG PPG: 23.1\nNUMBER: #13");
            imageStats.setCompoundDrawablesWithIntrinsicBounds(
                    0, R.drawable.myles, 0, 0 );
        }
        else if(item.equalsIgnoreCase("4. James Wiseman")){
            showInfo.setText("RANK/NAME: " + item +"\nTEAM: Memphis\nHEIGHT: 7'1\nWEIGHT: 240\nPOSITION: C\nCLASS: Freshman\nFT%: 51.7%" +
                    "\nFG%: 75.3%\nREB: 8.4\nAVG PPG: 19.2\nNUMBER: #32");
            imageStats.setCompoundDrawablesWithIntrinsicBounds(
                    0, R.drawable.jam, 0, 0 );
        }

        else if(item.equalsIgnoreCase("5. Cole Anthony")){
            showInfo.setText("RANK/NAME: " + item +"\nTEAM: North Carolina\nHEIGHT: 6'3\nWEIGHT: 190\nPOSITION: G\nCLASS: Freshman\nFT%: 66.7%" +
                    "\nFG%: 44.4%\nREB: 10.0\nAVG PPG: 17.8\nNUMBER: #2");
            imageStats.setCompoundDrawablesWithIntrinsicBounds(
                    0, R.drawable.cole, 0, 0 );
        }

        else if(item.equalsIgnoreCase("6. Jordan Nwora")){
            showInfo.setText("RANK/NAME: " + item +"\nTEAM: Louisville\nHEIGHT: 6'8\nWEIGHT: 215\nPOSITION: F\nCLASS: Junior\nFT%: 76.5%" +
                    "\nFG%: 44.6%\nREB: 7.6\nAVG PPG: 17.0\nNUMBER: #33");
            imageStats.setCompoundDrawablesWithIntrinsicBounds(
                    0, R.drawable.jor, 0, 0 );
        }

        else if(item.equalsIgnoreCase("7. Kerry Blackshear Jr.")){
            showInfo.setText("RANK/NAME: " + item +"\nTEAM: Florida\nHEIGHT: 6'10\nWEIGHT: 250\nPOSITION: F\nCLASS: Senior\nFT%: 73.6%" +
                    "\nFG%: 50.8%\nREB: 7.5\nAVG PPG: 14.9\nNUMBER: #24");
            imageStats.setCompoundDrawablesWithIntrinsicBounds(
                    0, R.drawable.kerr, 0, 0 );
        }

        else if(item.equalsIgnoreCase("8. Tre Jones")){
            showInfo.setText("RANK/NAME: " + item +"\nTEAM: Duke\nHEIGHT: 6'2\nWEIGHT: 183\nPOSITION: G\nCLASS: Sophomore\nFT%: 75.8%" +
                    "\nFG%: 41.4%\nREB: 3.8\nAVG PPG: 9.4\nNUMBER: #3");
            imageStats.setCompoundDrawablesWithIntrinsicBounds(
                    0, R.drawable.tre, 0, 0 );
        }

        else if(item.equalsIgnoreCase("9. Anthony Cowan Jr.")){
            showInfo.setText("RANK/NAME: " + item +"\nTEAM: Maryland\nHEIGHT: 6'0\nWEIGHT: 170\nPOSITION: G\nCLASS: Senior\nFT%: 80.6%" +
                    "\nFG%: 39.3%\nREB: 3.7\nAVG PPG: 15.6\nNUMBER: #1");
            imageStats.setCompoundDrawablesWithIntrinsicBounds(
                    0, R.drawable.cow, 0, 0 );
        }

        else if(item.equalsIgnoreCase("10. Lamar Stevens")){
            showInfo.setText("RANK/NAME: " + item +"\nTEAM: Penn State\nHEIGHT: 6'8\nWEIGHT: 230\nPOSITION: F\nCLASS: Senior\nFT%: 77.0%" +
                    "\nFG%: 42.2%\nREB: 7.7\nAVG PPG: 19.9\nNUMBER: #11");
            imageStats.setCompoundDrawablesWithIntrinsicBounds(
                    0, R.drawable.lam, 0, 0 );
        }

    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
    public void backHome(View v){
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
    }
}














//https://www.ncaa.com/news/basketball-men/article/2019-07-12/top-25-college-basketball-players-entering-2019-20-according

