package edu.tecii.android.wifiejemplo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class MainActivity extends Activity{
    Button enableButton;
    Button disableButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enableButton=(Button)findViewById(R.id.button1);
        disableButton=(Button)findViewById(R.id.button2);

        enableButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);
                Toast.makeText(getApplicationContext(), "Activaste el WiFi",
                        Toast.LENGTH_LONG).show();
            }
        });
        disableButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(false);
                Toast.makeText(getApplicationContext(), "Desactivaste el WiFi",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}


