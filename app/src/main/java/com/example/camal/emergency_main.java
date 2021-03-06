package com.example.camal;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class emergency_main extends AppCompatActivity {

// below text represents the user input data for emergency calls saving it to variable to store it! (also continues below)

    String name, email;
    int favoriteNumber;

    EditText nameInput;
    EditText emailInput;
    EditText favoriteNumberInput;
    Button submitButton;


//

    //           editTextUsername = findViewById(R.id.edit_text_username);
    //        editTextPassword = findViewById(R.id.edit_text_password);
    //        buttonConfirm = findViewById(R.id.button_confirm);
    //
    //        editTextUsername.addTextChangedListener(loginTextWatcher);
    //        editTextPassword.addTextChangedListener(loginTextWatcher);
    //    }

    ImageButton ibAmbulance, ibFirefighter, ibPolice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbarlayout_emergency);
        ibAmbulance = findViewById(R.id.ambulanceBtn);
        ibFirefighter = findViewById(R.id.fireFighterBtn);
        ibPolice = findViewById(R.id.policeBtn);
        ibAmbulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCallWithNumber("112");
            }
        });
        ibFirefighter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCallWithNumber("110");
            }
        });
        ibPolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCallWithNumber("155");
            }
        });

// below text represents the user input data for emergency calls saving it to variable to store it! (also above)

       /* nameInput = (EditText) findViewById(R.id.nameInput);
        emailInput = (EditText) findViewById(R.id.emailInput);
        favoriteNumberInput = (EditText) findViewById(R.id.favoriteNumberInput);

        submitButton = (Button) findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                favoriteNumber = Integer.valueOf(favoriteNumberInput.getText().toString());
                Toast.makeText(emergency_main.this, "all are stored", Toast.LENGTH_SHORT).show();
            }
        });

*/




    }




    private void startCallWithNumber(String number){
        Intent intent1 = new Intent(Intent.ACTION_CALL);
        intent1.setData(Uri.parse("tel:" + number));



        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        startActivity(intent1);
    }






}
