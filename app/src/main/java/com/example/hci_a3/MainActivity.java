package com.example.hci_a3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        TextView cmdPrompt = findViewById(R.id.cmdTxtview);

        Button L1button = findViewById(R.id.L1btn);
        Button L2button = findViewById(R.id.L2btn);
        Button L3button = findViewById(R.id.L3btn);
        Button L4button = findViewById(R.id.L4btn);
        Button L5button = findViewById(R.id.L5btn);
        Button L6button = findViewById(R.id.L6btn);

        Button button1 = findViewById(R.id.Btn1);
        Button button2 = findViewById(R.id.Btn2);
        Button button3 = findViewById(R.id.Btn3);
        Button button4 = findViewById(R.id.Btn4);
        Button button5 = findViewById(R.id.Btn5);
        Button button6 = findViewById(R.id.Btn6);
        Button button7 = findViewById(R.id.Btn7);
        Button button8 = findViewById(R.id.Btn8);
        Button button12 = findViewById(R.id.Btn12);
        Button button13 = findViewById(R.id.Btn13);
        Button button14 = findViewById(R.id.Btn14);
        Button button15 = findViewById(R.id.Btn15);
        Button button16 = findViewById(R.id.Btn16);
        Button button17 = findViewById(R.id.Btn17);
        Button button18 = findViewById(R.id.Btn18);
        Button button19 = findViewById(R.id.Btn19);
        Button button20 = findViewById(R.id.Btn20);
        Button button21 = findViewById(R.id.Btn21);
        Button button22 = findViewById(R.id.Btn22);

    }
}
