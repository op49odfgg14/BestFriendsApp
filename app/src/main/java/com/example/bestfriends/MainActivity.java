package com.example.bestfriends;

import android.arch.persistence.room.Room;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView isBestFriend;
    private String nameEntered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiate the database!
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "BestFriendDatabase").build();

        //enterButton set up
        Button enterButton = (Button)findViewById(R.id.enterButton);

        //name editText set up
        final EditText name = (EditText) findViewById(R.id.name);

        //Dialog for entering name
        enterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //check whos name it is (TODO: make into a database of friends!)
                if(name.getText().toString().equals("becca")
                        ||name.getText().toString().equals("Becca")
                        ||name.getText().toString().equals("Rebecca")
                        ||name.getText().toString().equals("rebecca")
                        ||name.getText().toString().equals("Becca Fung")
                        ||name.getText().toString().equals("Rebecca Fung")
                        ||name.getText().toString().equals("becca fung")
                        ||name.getText().toString().equals("rebecca fung"))  {

                    // name is entered
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    final View friendStatusView = getLayoutInflater().inflate(R.layout.is_best_friend, null);

                    //build and show popup
                    builder.setView(friendStatusView);
                    AlertDialog dialog = builder.create();
                    dialog.show();

                } else if(name.getText().toString().equals("mia")
                        ||name.getText().toString().equals("Mia")
                        ||name.getText().toString().equals("maya")
                        ||name.getText().toString().equals("Maya")
                        ||name.getText().toString().equals("Mia Ramsbottom")
                        ||name.getText().toString().equals("Maya Ramsbottom")
                        ||name.getText().toString().equals("mia ramsbottom")
                        ||name.getText().toString().equals("maya ramsbottom")){

                    // name is entered
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    final View friendStatusView = getLayoutInflater().inflate(R.layout.is_girlfriend, null);

                    //build and show popup
                    builder.setView(friendStatusView);
                    AlertDialog dialog = builder.create();
                    dialog.show();

                } else {

                    // name is entered
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    final View friendStatusView = getLayoutInflater().inflate(R.layout.is_not_best_friend, null);

                    //build and show popup
                    builder.setView(friendStatusView);
                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
            }
        });

    }
}
