package com.example.hci_a3;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.graphics.*;
import java.util.Calendar;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ArrayList<Button> largeButtonsAR = new ArrayList<>();
    private ArrayList<Button> mediumButtonsAR = new ArrayList<>();
    private ArrayList<Button> smallButtonsAR = new ArrayList<>();
    private Button currActiveButton = null;
    private int smallTrials = 10;
    private int mediumTrials = 10;
    private int largeTrials = 10;
    private int errorTrial = 0;
    private int currType = -1;       //0 = small, 1 = medium, 2 = large
    private Instant trialStartTime;
    private DialogHandler dialogHandler;
    private String currMode = "Default";

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

    public void deactivateCurrActiveButton() {
        if(currActiveButton != null)
            currActiveButton.getBackground().clearColorFilter();
    }

    public void setRandomActiveButton(){
        //pick a random size group
        currType = new Random().nextInt(3);

        switch (currType) {
            case 0:
                if (smallTrials > 0) {
                    setRandomSmallButton();
                } else {
                    setRandomActiveButton();
                }
                break;
            case 1:
                if (mediumTrials > 0) {
                    setRandomMediumButton();
                } else {
                    setRandomActiveButton();
                }
                break;
            case 2:
                if (largeTrials > 0) {
                    setRandomLargeButton();
                } else {
                    setRandomActiveButton();
                }
                break;
        }
    }

    public void setRandomSmallButton(){
        Button b = smallButtonsAR.get( new Random().nextInt(smallButtonsAR.size()));
        deactivateCurrActiveButton();
        setCurrActiveButton(b);
    }

    public void setRandomMediumButton(){
        Button b = mediumButtonsAR.get(new Random().nextInt(mediumButtonsAR.size()));
        deactivateCurrActiveButton();
        setCurrActiveButton(b);
    }

    public void setRandomLargeButton(){
        Button b = largeButtonsAR.get(new Random().nextInt(largeButtonsAR.size()));
        deactivateCurrActiveButton();
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
                currMode = "Default";
                return true;
            case R.id.tapTap:
                currMode = "TapTap";
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

        mediumButtonsAR.add(M1button);
        mediumButtonsAR.add(M2button);
        mediumButtonsAR.add(M3button);
        mediumButtonsAR.add(M4button);
        mediumButtonsAR.add(M5button);
        mediumButtonsAR.add(M6button);
        mediumButtonsAR.add(M7button);
        mediumButtonsAR.add(M8button);
        mediumButtonsAR.add(M9button);
        mediumButtonsAR.add(M10button);
        mediumButtonsAR.add(M11button);
        mediumButtonsAR.add(M12button);
        mediumButtonsAR.add(M13button);
        mediumButtonsAR.add(M14button);
        mediumButtonsAR.add(M15button);
        mediumButtonsAR.add(M16button);
        mediumButtonsAR.add(M17button);
        mediumButtonsAR.add(M18button);
        mediumButtonsAR.add(M19button);
        mediumButtonsAR.add(M20button);
        mediumButtonsAR.add(M21button);
        mediumButtonsAR.add(M22button);
        mediumButtonsAR.add(M23button);
        mediumButtonsAR.add(M24button);
        mediumButtonsAR.add(M25button);
        mediumButtonsAR.add(M26button);
        mediumButtonsAR.add(M27button);
        mediumButtonsAR.add(M28button);
        mediumButtonsAR.add(M29button);
        mediumButtonsAR.add(M30button);
        mediumButtonsAR.add(M31button);
        mediumButtonsAR.add(M32button);
        mediumButtonsAR.add(M33button);
        mediumButtonsAR.add(M34button);
        mediumButtonsAR.add(M35button);
        mediumButtonsAR.add(M36button);

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

        smallButtonsAR.add(S1button);
        smallButtonsAR.add(S2button);
        smallButtonsAR.add(S3button);
        smallButtonsAR.add(S4button);
        smallButtonsAR.add(S5button);
        smallButtonsAR.add(S6button);
        smallButtonsAR.add(S7button);
        smallButtonsAR.add(S8button);
        smallButtonsAR.add(S9button);
        smallButtonsAR.add(S10button);
        smallButtonsAR.add(S11button);
        smallButtonsAR.add(S12button);
        smallButtonsAR.add(S13button);
        smallButtonsAR.add(S14button);
        smallButtonsAR.add(S15button);
        smallButtonsAR.add(S16button);
        smallButtonsAR.add(S17button);
        smallButtonsAR.add(S18button);
        smallButtonsAR.add(S19button);
        smallButtonsAR.add(S20button);
        smallButtonsAR.add(S21button);
        smallButtonsAR.add(S22button);
        smallButtonsAR.add(S23button);
        smallButtonsAR.add(S24button);
        smallButtonsAR.add(S25button);
        smallButtonsAR.add(S26button);
        smallButtonsAR.add(S27button);
        smallButtonsAR.add(S28button);
        smallButtonsAR.add(S29button);
        smallButtonsAR.add(S30button);
        smallButtonsAR.add(S31button);
        smallButtonsAR.add(S32button);
        smallButtonsAR.add(S33button);
        smallButtonsAR.add(S34button);
        smallButtonsAR.add(S35button);
        smallButtonsAR.add(S36button);
        smallButtonsAR.add(S37button);
        smallButtonsAR.add(S38button);
        smallButtonsAR.add(S39button);
        smallButtonsAR.add(S40button);
        smallButtonsAR.add(S41button);
        smallButtonsAR.add(S42button);
        smallButtonsAR.add(S43button);
        smallButtonsAR.add(S44button);
        smallButtonsAR.add(S45button);
        smallButtonsAR.add(S46button);
        smallButtonsAR.add(S47button);
        smallButtonsAR.add(S48button);
        smallButtonsAR.add(S49button);
        smallButtonsAR.add(S50button);
        smallButtonsAR.add(S51button);
        smallButtonsAR.add(S52button);
        smallButtonsAR.add(S53button);
        smallButtonsAR.add(S54button);
        smallButtonsAR.add(S55button);
        smallButtonsAR.add(S56button);
        smallButtonsAR.add(S57button);
        smallButtonsAR.add(S58button);
        smallButtonsAR.add(S59button);
        smallButtonsAR.add(S60button);
        smallButtonsAR.add(S61button);
        smallButtonsAR.add(S62button);
        smallButtonsAR.add(S63button);
        smallButtonsAR.add(S64button);
        smallButtonsAR.add(S65button);
        smallButtonsAR.add(S66button);
        smallButtonsAR.add(S67button);
        smallButtonsAR.add(S68button);
        smallButtonsAR.add(S69button);
        smallButtonsAR.add(S70button);
        smallButtonsAR.add(S71button);
        smallButtonsAR.add(S72button);
        smallButtonsAR.add(S73button);
        smallButtonsAR.add(S74button);
        smallButtonsAR.add(S75button);
        smallButtonsAR.add(S76button);
        smallButtonsAR.add(S77button);
        smallButtonsAR.add(S78button);
        smallButtonsAR.add(S79button);
        smallButtonsAR.add(S80button);
        smallButtonsAR.add(S81button);
        smallButtonsAR.add(S82button);
        smallButtonsAR.add(S83button);
        smallButtonsAR.add(S84button);

        currActiveButton = findViewById(R.id.StartButton);
        start();
    }

    public void startTrial(View view){
        //record start time
        if(largeTrials > 0 || mediumTrials > 0 || smallTrials > 0) {
            trialStartTime = Instant.now();
            setRandomActiveButton();
            Log.print("Start Time: " + trialStartTime);
        }else{
            Log.print("WE NEED TO HANDLE COMPLETION OF THE TEST");
            showDialog(DialogHandler.DONE_DIALOG_ID);
        }
    }

    public void endTrial(View view){
        Log.print("END TRIAL");
        Long timeDifference = new Long(0);
        Instant trialEndTime = Instant.now();
        //if button is the curr active button

        if(view.getId() == currActiveButton.getId()){
            if (trialStartTime != null) {
                timeDifference = ChronoUnit.MILLIS.between(trialStartTime,trialEndTime);
            }

            switch(currType){
                case 0:
                    smallTrials--;
                    DataRecorder.getInstance().recordRaw((String.format("%s - small - %d", currMode, timeDifference)));
                    break;
                case 1:
                    mediumTrials--;
                    DataRecorder.getInstance().recordRaw((String.format("%s - medium - %d", currMode, timeDifference)));
                    break;
                case 2:
                    largeTrials--;
                    DataRecorder.getInstance().recordRaw((String.format("%s - large - %d", currMode, timeDifference)));
                    break;
            }
        //else record as error trial
        }else{
            errorTrial++;

            switch(currType) {
                case 0:
                    DataRecorder.getInstance().recordRaw(String.format("%s - small - ERROR", currMode));
                    break;
                case 1:
                    DataRecorder.getInstance().recordRaw(String.format("%s - medium - ERROR", currMode));
                    break;
                case 2:
                    DataRecorder.getInstance().recordRaw(String.format("%s - large - ERROR", currMode));
                    break;
            }
        }
        // reset the curr active button
        deactivateCurrActiveButton();
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
        User.reset();
        DataRecorder.getInstance().clear();
        smallTrials = mediumTrials = largeTrials = 10;
        errorTrial = 0;
        currType = -1;
        deactivateCurrActiveButton();
        currActiveButton = null;
        start();
    }
}
