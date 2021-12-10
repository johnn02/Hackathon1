package com.example.oursejahtera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.oursejahtera.databinding.ActivityMainBinding;

public class ThirdPage extends AppCompatActivity {


    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);

    }

    public void myClickHandler(View v) {
        Button but = (Button) findViewById(R.id.button3);
        but.isClickable();
        switch (v.getId()) {
            case R.id.button3:
                if (but.isPressed()) {
                    Toast toast = Toast.makeText(this, "Your application has been submitted successfully.", Toast.LENGTH_LONG);
                    toast.show();
                } else but.setText("Nothing happened");
                break;
        }
    }
}