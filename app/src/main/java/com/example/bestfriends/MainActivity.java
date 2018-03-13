package com.example.bestfriends;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView isBestFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enterButton set up
        Button enterButton = (Button)findViewById(R.id.enterButton);

        //name editText set up
        EditText name = (EditText) findViewById(R.id.name);

        //Dialog for entering name
        enterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // name is entered
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                final View friendStatusView = getLayoutInflater().inflate(R.layout.is_best_friend, null);

                //build and show popup
                builder.setView(friendStatusView);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }
}
