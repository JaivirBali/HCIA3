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
    ArrayList<Button> buttonsAR = new ArrayList<>();
    Button currActiveButton = null;

    public Button getCurrActiveButton() {
        return currActiveButton;
    }
    public void setCurrActiveButton(Button b) {
        currActiveButton = b;
        currActiveButton.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
    }
    public void setRandomActiveButton(){
        Button b = buttonsAR.get((int)(Math.random()*buttonsAR.size()));
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
        buttonsAR.add(L1button);
        Button L2button = findViewById(R.id.L2btn);
        buttonsAR.add(L2button);
        Button L3button = findViewById(R.id.L3btn);
        buttonsAR.add(L3button);
        Button L4button = findViewById(R.id.L4btn);
        buttonsAR.add(L4button);
        Button L5button = findViewById(R.id.L5btn);
        buttonsAR.add(L5button);
        Button L6button = findViewById(R.id.L6btn);
        buttonsAR.add(L6button);
        Button button1 = findViewById(R.id.Btn1);
        buttonsAR.add(button1);
        Button button2 = findViewById(R.id.Btn2);
        buttonsAR.add(button2);
        Button button3 = findViewById(R.id.Btn3);
        buttonsAR.add(button3);
        Button button4 = findViewById(R.id.Btn4);
        buttonsAR.add(button4);
        Button button5 = findViewById(R.id.Btn5);
        buttonsAR.add(button5);
        Button button6 = findViewById(R.id.Btn6);
        buttonsAR.add(button6);
        Button button7 = findViewById(R.id.Btn7);
        buttonsAR.add(button7);
        Button button8 = findViewById(R.id.Btn8);
        buttonsAR.add(button8);
        Button button12 = findViewById(R.id.Btn12);
        buttonsAR.add(button12);
        Button button13 = findViewById(R.id.Btn13);
        buttonsAR.add(button13);
        Button button14 = findViewById(R.id.Btn14);
        buttonsAR.add(button14);
        Button button15 = findViewById(R.id.Btn15);
        buttonsAR.add(button15);
        Button button16 = findViewById(R.id.Btn16);
        buttonsAR.add(button16);
        Button button17 = findViewById(R.id.Btn17);
        buttonsAR.add(button17);
        Button button18 = findViewById(R.id.Btn18);
        buttonsAR.add(button18);
        Button button19 = findViewById(R.id.Btn19);
        buttonsAR.add(button19);
        Button button20 = findViewById(R.id.Btn20);
        buttonsAR.add(button20);
        Button button21 = findViewById(R.id.Btn21);
        buttonsAR.add(button21);
        Button button22 = findViewById(R.id.Btn22);
        buttonsAR.add(button22);
        setRandomActiveButton();

    }


}
