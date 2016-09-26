package edu.calvin.cl43.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.EditText;

/**
 *  Chris Li, cl43, cs262, lab 03, Prof. Vanderlinden
 *  <p>
 *  This app requests the user to enter the password. It will display an image if the entered password is correct or it will warn you if it is wrong.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Calls the image, editText into objects within the code.
         * Hides the image for now.
         */
        ImageView image = (ImageView)findViewById(R.id.imageView);
        EditText edit = (EditText) findViewById(R.id.editText);
        image.setVisibility(View.INVISIBLE);

        /**
         * Causes stuff to happen when the green checkmark is clicked.
         */
        edit.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                /**
                 * More variables being called in. Some are repeats to handle inner functions.
                 */
                ImageView image = (ImageView)findViewById(R.id.imageView);
                EditText edit = (EditText) findViewById(R.id.editText);
                TextView output = (TextView) findViewById(R.id.output);
                String input = edit.getText().toString();

                /**
                 * If statement to check whether the password is correct or not. Displays picture if it is. Switches picture and warns you if it isn't.
                 */
                if(input.equals("bingbing")){//Here is the password\\
                    output.setText(" ");
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.ic_launcher));
                    image.setVisibility(View.VISIBLE);
                }else {
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.ic_launcher2));
                    image.setVisibility(View.VISIBLE);
                    output.setText("Incorrect password...");
                }
                return true;
            }
        });


}}
