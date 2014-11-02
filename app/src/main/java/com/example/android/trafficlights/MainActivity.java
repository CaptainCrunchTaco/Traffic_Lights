package com.example.android.trafficlights;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity implements OnClickListener {

    private ImageView redLight;
    private ImageView yellowLight;
    private ImageView greenLight;

    private Button redButton;
    private Button yellowButton;
    private Button greenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redLight = (ImageView) findViewById(R.id.redLight);
        yellowLight = (ImageView) findViewById(R.id.yellowLight);
        greenLight = (ImageView) findViewById(R.id.greenLight);

        redButton = (Button) findViewById(R.id.redButton);
        yellowButton = (Button) findViewById(R.id.yellowButton);
        greenButton = (Button) findViewById(R.id.greenButton);

        redButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);

        redLight.setOnClickListener(this);
        yellowLight.setOnClickListener(this);
        greenLight.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        turnAllOff();
        switch ( v.getId() ) {
            case R.id.redButton:
                redOn();
                break;
            case R.id.redLight:
                redOn();
                break;
            case R.id.yellowButton:
                yellowOn();
                break;
            case R.id.yellowLight:
                yellowOn();
                break;
            case R.id.greenButton:
                greenOn();
                break;
            case R.id.greenLight:
                greenOn();
                break;
            default:
                break;
        }
    }

    private void turnAllOff() {
        redLight.setImageResource(R.drawable.light_off);
        yellowLight.setImageResource(R.drawable.light_off);
        greenLight.setImageResource(R.drawable.light_off);
    }

    private void redOn() {
        redLight.setImageResource(R.drawable.red_on);
    }

    private void yellowOn() {
        yellowLight.setImageResource(R.drawable.yellow_on);
    }

    private void greenOn() {
        greenLight.setImageResource(R.drawable.green_on);
    }

}
