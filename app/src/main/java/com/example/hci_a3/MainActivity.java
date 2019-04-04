package com.example.hci_a3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.*;
import java.math.*;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private final int NUM_TRIALS = 20;
    private ArrayList<Button> largeButtonsAR = new ArrayList<>();
    private ArrayList<Button> mediumButtonsAR = new ArrayList<>();
    private ArrayList<Button> smallButtonsAR = new ArrayList<>();
    private Button currActiveButton = null;
    private int smallTrials = 0;
    private int mediumTrials = 0;
    private int largeTrials = 0;

    public int getSmallTrials(){return smallTrials;}
    public int getMediumTrials(){return mediumTrials;}
    public int getLargeTrials(){return largeTrials;}
    public Button getCurrActiveButton() {
        return currActiveButton;
    }
    public void setCurrActiveButton(Button b) {
        currActiveButton = b;
        currActiveButton.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
    }
    public void setRandomActiveButton(){
        //pick a random size group


        //if that size group has less trials than NUM_TRIALS, find a random button in that group

        //else pick a different size group

    }
    public void setRandomSmallButton(){
        Button b = smallButtonsAR.get((int)(Math.random()*smallButtonsAR.size()));
        setCurrActiveButton(b);
    }
    public void setRandomMediumButton(){
        Button b = mediumButtonsAR.get((int)(Math.random()*mediumButtonsAR.size()));
        setCurrActiveButton(b);
    }
    public void setRandomLargeButton(){
        Button b = largeButtonsAR.get((int)(Math.random()*largeButtonsAR.size()));
        setCurrActiveButton(b);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.defaultMode:
                return true;
            case R.id.pinchToZoom:
                return true;

            case R.id.tapTap:
                return true;

            case R.id.reset:
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        TextView cmdPrompt = findViewById(R.id.cmdTxtview);

        Button L1button = findViewById(R.id.L1btn);
        largeButtonsAR.add(L1button);
        Button L2button = findViewById(R.id.L2btn);
        largeButtonsAR.add(L2button);
        Button L3button = findViewById(R.id.L3btn);
        largeButtonsAR.add(L3button);
        Button L4button = findViewById(R.id.L4btn);
        largeButtonsAR.add(L4button);
        Button L5button = findViewById(R.id.L5btn);
        largeButtonsAR.add(L5button);
        Button L6button = findViewById(R.id.L6btn);
        largeButtonsAR.add(L6button);
        Button button1 = findViewById(R.id.Btn1);
        mediumButtonsAR.add(button1);
        Button button2 = findViewById(R.id.Btn2);
        mediumButtonsAR.add(button2);
        Button button3 = findViewById(R.id.Btn3);
        mediumButtonsAR.add(button3);
        Button button4 = findViewById(R.id.Btn4);
        mediumButtonsAR.add(button4);
        Button button5 = findViewById(R.id.Btn5);
        mediumButtonsAR.add(button5);
        Button button6 = findViewById(R.id.Btn6);
        mediumButtonsAR.add(button6);
        Button button7 = findViewById(R.id.Btn7);
        mediumButtonsAR.add(button7);
        Button button8 = findViewById(R.id.Btn8);
        mediumButtonsAR.add(button8);
        Button button12 = findViewById(R.id.Btn12);
        smallButtonsAR.add(button12);
        Button button13 = findViewById(R.id.Btn13);
        smallButtonsAR.add(button13);
        Button button14 = findViewById(R.id.Btn14);
        smallButtonsAR.add(button14);
        Button button15 = findViewById(R.id.Btn15);
        smallButtonsAR.add(button15);
        Button button16 = findViewById(R.id.Btn16);
        smallButtonsAR.add(button16);
        Button button17 = findViewById(R.id.Btn17);
        smallButtonsAR.add(button17);
        Button button18 = findViewById(R.id.Btn18);
        smallButtonsAR.add(button18);
        Button button19 = findViewById(R.id.Btn19);
        smallButtonsAR.add(button19);
        Button button20 = findViewById(R.id.Btn20);
        smallButtonsAR.add(button20);
        Button button21 = findViewById(R.id.Btn21);
        smallButtonsAR.add(button21);
        Button button22 = findViewById(R.id.Btn22);
        smallButtonsAR.add(button22);
        setRandomActiveButton();

    }


}
