package com.example.hci_a3;

import android.app.Dialog;
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
    private DialogHandler dialogHandler;

    public int getSmallTrials(){
        return smallTrials;
    }

    public int getMediumTrials(){
        return mediumTrials;
    }

    public int getLargeTrials(){
        return largeTrials;
    }

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
                reStart();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dialogHandler = new DialogHandler(this);

        setContentView(R.layout.activity_buttons);


        Button L99button = findViewById(R.id.L99btn);
        Button L98button = findViewById(R.id.L98btn);
        Button L97button = findViewById(R.id.L97btn);
        Button L96button = findViewById(R.id.L96btn);
        Button L95button = findViewById(R.id.L95btn);
        Button L94button = findViewById(R.id.L94btn);
        Button L93button = findViewById(R.id.L93btn);
        Button L92button = findViewById(R.id.L92btn);
        Button L91button = findViewById(R.id.L91btn);
        Button L90button = findViewById(R.id.L90btn);
        Button L89button = findViewById(R.id.L89btn);
        Button L88button = findViewById(R.id.L88btn);
        Button L87button = findViewById(R.id.L87btn);
        Button L86button = findViewById(R.id.L86btn);
        Button L85button = findViewById(R.id.L85btn);
        Button L84button = findViewById(R.id.L84btn);
        Button L83button = findViewById(R.id.L83btn);
        Button L82button = findViewById(R.id.L82btn);
        Button L81button = findViewById(R.id.L81btn);
        Button L80button = findViewById(R.id.L80btn);
        Button L79button = findViewById(R.id.L79btn);
        Button L78button = findViewById(R.id.L78btn);
        Button L77button = findViewById(R.id.L77btn);
        Button L76button = findViewById(R.id.L76btn);
        Button L75button = findViewById(R.id.L75btn);
        Button L74button = findViewById(R.id.L74btn);
        Button L73button = findViewById(R.id.L73btn);
        Button L72button = findViewById(R.id.L72btn);

        largeButtonsAR.add(L99button);
        largeButtonsAR.add(L98button);
        largeButtonsAR.add(L97button);
        largeButtonsAR.add(L96button);
        largeButtonsAR.add(L95button);
        largeButtonsAR.add(L94button);
        largeButtonsAR.add(L93button);
        largeButtonsAR.add(L92button);
        largeButtonsAR.add(L91button);
        largeButtonsAR.add(L90button);
        largeButtonsAR.add(L89button);
        largeButtonsAR.add(L88button);
        largeButtonsAR.add(L87button);
        largeButtonsAR.add(L86button);
        largeButtonsAR.add(L85button);
        largeButtonsAR.add(L84button);
        largeButtonsAR.add(L83button);
        largeButtonsAR.add(L82button);
        largeButtonsAR.add(L81button);
        largeButtonsAR.add(L80button);
        largeButtonsAR.add(L79button);
        largeButtonsAR.add(L78button);
        largeButtonsAR.add(L77button);
        largeButtonsAR.add(L76button);
        largeButtonsAR.add(L75button);
        largeButtonsAR.add(L74button);
        largeButtonsAR.add(L73button);
        largeButtonsAR.add(L72button);

        Button M1button = findViewById(R.id.Btn1);
        Button M2button = findViewById(R.id.Btn2);
        Button M3button = findViewById(R.id.Btn3);
        Button M4button = findViewById(R.id.Btn4);
        Button M5button = findViewById(R.id.Btn5);
        Button M6button = findViewById(R.id.Btn6);
        Button M7button = findViewById(R.id.Btn7);
        Button M8button = findViewById(R.id.Btn8);
        Button M9button = findViewById(R.id.Btn9);
        Button M10button = findViewById(R.id.Btn10);
        Button M11button = findViewById(R.id.Btn11);
        Button M12button = findViewById(R.id.Btn12);
        Button M13button = findViewById(R.id.Btn13);
        Button M14button = findViewById(R.id.Btn14);
        Button M15button = findViewById(R.id.Btn15);
        Button M16button = findViewById(R.id.Btn16);
        Button M17button = findViewById(R.id.Btn17);
        Button M18button = findViewById(R.id.Btn18);
        Button M19button = findViewById(R.id.Btn19);
        Button M20button = findViewById(R.id.Btn20);
        Button M21button = findViewById(R.id.Btn21);
        Button M22button = findViewById(R.id.Btn22);
        Button M23button = findViewById(R.id.Btn23);
        Button M24button = findViewById(R.id.Btn24);
        Button M25button = findViewById(R.id.Btn25);
        Button M26button = findViewById(R.id.Btn26);
        Button M27button = findViewById(R.id.Btn27);
        Button M28button = findViewById(R.id.Btn28);
        Button M29button = findViewById(R.id.Btn29);
        Button M30button = findViewById(R.id.Btn30);
        Button M31button = findViewById(R.id.Btn31);
        Button M32button = findViewById(R.id.Btn32);
        Button M33button = findViewById(R.id.Btn33);
        Button M34button = findViewById(R.id.Btn34);
        Button M35button = findViewById(R.id.Btn35);
        Button M36button = findViewById(R.id.Btn36);

        largeButtonsAR.add(M1button);
        largeButtonsAR.add(M2button);
        largeButtonsAR.add(M3button);
        largeButtonsAR.add(M4button);
        largeButtonsAR.add(M5button);
        largeButtonsAR.add(M6button);
        largeButtonsAR.add(M7button);
        largeButtonsAR.add(M8button);
        largeButtonsAR.add(M9button);
        largeButtonsAR.add(M10button);
        largeButtonsAR.add(M11button);
        largeButtonsAR.add(M12button);
        largeButtonsAR.add(M13button);
        largeButtonsAR.add(M14button);
        largeButtonsAR.add(M15button);
        largeButtonsAR.add(M16button);
        largeButtonsAR.add(M17button);
        largeButtonsAR.add(M18button);
        largeButtonsAR.add(M19button);
        largeButtonsAR.add(M20button);
        largeButtonsAR.add(M21button);
        largeButtonsAR.add(M22button);
        largeButtonsAR.add(M23button);
        largeButtonsAR.add(M24button);
        largeButtonsAR.add(M25button);
        largeButtonsAR.add(M26button);
        largeButtonsAR.add(M27button);
        largeButtonsAR.add(M28button);
        largeButtonsAR.add(M29button);
        largeButtonsAR.add(M30button);
        largeButtonsAR.add(M31button);
        largeButtonsAR.add(M32button);
        largeButtonsAR.add(M33button);
        largeButtonsAR.add(M34button);
        largeButtonsAR.add(M35button);
        largeButtonsAR.add(M36button);

        Button S1button = findViewById(R.id.sBtn1);
        Button S2button = findViewById(R.id.sBtn2);
        Button S3button = findViewById(R.id.sBtn3);
        Button S4button = findViewById(R.id.sBtn4);
        Button S5button = findViewById(R.id.sBtn5);
        Button S6button = findViewById(R.id.sBtn6);
        Button S7button = findViewById(R.id.sBtn7);
        Button S8button = findViewById(R.id.sBtn8);
        Button S9button = findViewById(R.id.sBtn9);
        Button S10button = findViewById(R.id.sBtn10);
        Button S11button = findViewById(R.id.sBtn11);
        Button S12button = findViewById(R.id.sBtn12);
        Button S13button = findViewById(R.id.sBtn13);
        Button S14button = findViewById(R.id.sBtn14);
        Button S15button = findViewById(R.id.sBtn15);
        Button S16button = findViewById(R.id.sBtn16);
        Button S17button = findViewById(R.id.sBtn17);
        Button S18button = findViewById(R.id.sBtn18);
        Button S19button = findViewById(R.id.sBtn19);
        Button S20button = findViewById(R.id.sBtn20);
        Button S21button = findViewById(R.id.sBtn21);
        Button S22button = findViewById(R.id.sBtn22);
        Button S23button = findViewById(R.id.sBtn23);
        Button S24button = findViewById(R.id.sBtn24);
        Button S25button = findViewById(R.id.sBtn25);
        Button S26button = findViewById(R.id.sBtn26);
        Button S27button = findViewById(R.id.sBtn27);
        Button S28button = findViewById(R.id.sBtn28);
        Button S29button = findViewById(R.id.sBtn29);
        Button S30button = findViewById(R.id.sBtn30);
        Button S31button = findViewById(R.id.sBtn31);
        Button S32button = findViewById(R.id.sBtn32);
        Button S33button = findViewById(R.id.sBtn33);
        Button S34button = findViewById(R.id.sBtn34);
        Button S35button = findViewById(R.id.sBtn35);
        Button S36button = findViewById(R.id.sBtn36);
        Button S37button = findViewById(R.id.sBtn37);
        Button S38button = findViewById(R.id.sBtn38);
        Button S39button = findViewById(R.id.sBtn39);
        Button S40button = findViewById(R.id.sBtn40);
        Button S41button = findViewById(R.id.sBtn41);
        Button S42button = findViewById(R.id.sBtn42);
        Button S43button = findViewById(R.id.sBtn43);
        Button S44button = findViewById(R.id.sBtn44);
        Button S45button = findViewById(R.id.sBtn45);
        Button S46button = findViewById(R.id.sBtn46);
        Button S47button = findViewById(R.id.sBtn47);
        Button S48button = findViewById(R.id.sBtn48);
        Button S49button = findViewById(R.id.sBtn49);
        Button S50button = findViewById(R.id.sBtn50);
        Button S51button = findViewById(R.id.sBtn51);
        Button S52button = findViewById(R.id.sBtn52);
        Button S53button = findViewById(R.id.sBtn53);
        Button S54button = findViewById(R.id.sBtn54);
        Button S55button = findViewById(R.id.sBtn55);
        Button S56button = findViewById(R.id.sBtn56);
        Button S57button = findViewById(R.id.sBtn57);
        Button S58button = findViewById(R.id.sBtn58);
        Button S59button = findViewById(R.id.sBtn59);
        Button S60button = findViewById(R.id.sBtn60);
        Button S61button = findViewById(R.id.sBtn61);
        Button S62button = findViewById(R.id.sBtn62);
        Button S63button = findViewById(R.id.sBtn63);
        Button S64button = findViewById(R.id.sBtn64);
        Button S65button = findViewById(R.id.sBtn65);
        Button S66button = findViewById(R.id.sBtn66);
        Button S67button = findViewById(R.id.sBtn67);
        Button S68button = findViewById(R.id.sBtn68);
        Button S69button = findViewById(R.id.sBtn69);
        Button S70button = findViewById(R.id.sBtn70);
        Button S71button = findViewById(R.id.sBtn71);
        Button S72button = findViewById(R.id.sBtn72);
        Button S73button = findViewById(R.id.sBtn73);
        Button S74button = findViewById(R.id.sBtn74);
        Button S75button = findViewById(R.id.sBtn75);
        Button S76button = findViewById(R.id.sBtn76);
        Button S77button = findViewById(R.id.sBtn77);
        Button S78button = findViewById(R.id.sBtn78);
        Button S79button = findViewById(R.id.sBtn79);
        Button S80button = findViewById(R.id.sBtn80);
        Button S81button = findViewById(R.id.sBtn81);
        Button S82button = findViewById(R.id.sBtn82);
        Button S83button = findViewById(R.id.sBtn83);
        Button S84button = findViewById(R.id.sBtn84);

        largeButtonsAR.add(S1button);
        largeButtonsAR.add(S2button);
        largeButtonsAR.add(S3button);
        largeButtonsAR.add(S4button);
        largeButtonsAR.add(S5button);
        largeButtonsAR.add(S6button);
        largeButtonsAR.add(S7button);
        largeButtonsAR.add(S8button);
        largeButtonsAR.add(S9button);
        largeButtonsAR.add(S10button);
        largeButtonsAR.add(S11button);
        largeButtonsAR.add(S12button);
        largeButtonsAR.add(S13button);
        largeButtonsAR.add(S14button);
        largeButtonsAR.add(S15button);
        largeButtonsAR.add(S16button);
        largeButtonsAR.add(S17button);
        largeButtonsAR.add(S18button);
        largeButtonsAR.add(S19button);
        largeButtonsAR.add(S20button);
        largeButtonsAR.add(S21button);
        largeButtonsAR.add(S22button);
        largeButtonsAR.add(S23button);
        largeButtonsAR.add(S24button);
        largeButtonsAR.add(S25button);
        largeButtonsAR.add(S26button);
        largeButtonsAR.add(S27button);
        largeButtonsAR.add(S28button);
        largeButtonsAR.add(S29button);
        largeButtonsAR.add(S30button);
        largeButtonsAR.add(S31button);
        largeButtonsAR.add(S32button);
        largeButtonsAR.add(S33button);
        largeButtonsAR.add(S34button);
        largeButtonsAR.add(S35button);
        largeButtonsAR.add(S36button);
        largeButtonsAR.add(S37button);
        largeButtonsAR.add(S38button);
        largeButtonsAR.add(S39button);
        largeButtonsAR.add(S40button);
        largeButtonsAR.add(S41button);
        largeButtonsAR.add(S42button);
        largeButtonsAR.add(S43button);
        largeButtonsAR.add(S44button);
        largeButtonsAR.add(S45button);
        largeButtonsAR.add(S46button);
        largeButtonsAR.add(S47button);
        largeButtonsAR.add(S48button);
        largeButtonsAR.add(S49button);
        largeButtonsAR.add(S50button);
        largeButtonsAR.add(S51button);
        largeButtonsAR.add(S52button);
        largeButtonsAR.add(S53button);
        largeButtonsAR.add(S54button);
        largeButtonsAR.add(S55button);
        largeButtonsAR.add(S56button);
        largeButtonsAR.add(S57button);
        largeButtonsAR.add(S58button);
        largeButtonsAR.add(S59button);
        largeButtonsAR.add(S60button);
        largeButtonsAR.add(S61button);
        largeButtonsAR.add(S62button);
        largeButtonsAR.add(S63button);
        largeButtonsAR.add(S64button);
        largeButtonsAR.add(S65button);
        largeButtonsAR.add(S66button);
        largeButtonsAR.add(S67button);
        largeButtonsAR.add(S68button);
        largeButtonsAR.add(S69button);
        largeButtonsAR.add(S70button);
        largeButtonsAR.add(S71button);
        largeButtonsAR.add(S72button);
        largeButtonsAR.add(S73button);
        largeButtonsAR.add(S74button);
        largeButtonsAR.add(S75button);
        largeButtonsAR.add(S76button);
        largeButtonsAR.add(S77button);
        largeButtonsAR.add(S78button);
        largeButtonsAR.add(S79button);
        largeButtonsAR.add(S80button);
        largeButtonsAR.add(S81button);
        largeButtonsAR.add(S82button);
        largeButtonsAR.add(S83button);
        largeButtonsAR.add(S84button);

        start();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        Dialog dialog = dialogHandler.onCreateDialog(id);

        return (dialog != null) ? dialog : super.onCreateDialog(id);
    }

    private void start() {
        showDialog(DialogHandler.ASK_USER_NAME_ID);
    }

    public void reStart() {
        DataRecorder.getInstance().clear();
        User.reset();
        start();
    }
}
