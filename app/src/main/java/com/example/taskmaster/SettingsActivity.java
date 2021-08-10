package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }

    public void nameSubmit(View view) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);// getter
        SharedPreferences.Editor preferenceEditor = preferences.edit();
        EditText address = findViewById(R.id.editTextTextPersonName);
        preferenceEditor.putString("userName", address.getText().toString());
        preferenceEditor.apply();

        Toast toast = Toast.makeText(this, "Your Name Saved", Toast.LENGTH_SHORT);
        toast.show();
    }
}