package com.example.taskmaster;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addTaskButton =findViewById(R.id.button);
        addTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addTaskPage=new Intent(MainActivity.this,AddTaskActivity.class);
                startActivity(addTaskPage);
            }
        });



        Button showAllTasks= findViewById(R.id.button3);
        showAllTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showAllTasks=new Intent(MainActivity.this,AllTasksActivity.class);
                startActivity(showAllTasks);
            }
        });
    }

    public void firstButton(View view) {
        Intent tasks = new Intent(this,TasksDetailActivity.class);
        tasks.putExtra("title", "Task1");
        startActivity(tasks);

    }

    public void secButt(View view) {
        Intent tasks = new Intent(this,TasksDetailActivity.class);
        tasks.putExtra("title", "Task2");
        startActivity(tasks);
    }

    public void therButt(View view) {
        Intent tasks = new Intent(this,TasksDetailActivity.class);
        tasks.putExtra("title", "Task3");
        startActivity(tasks);
    }


    public void settingsButton(View view) {
        Intent setting = new Intent(MainActivity.this, SettingsActivity.class);
        MainActivity.this.startActivity(setting);
    }
    @Override
    public void onResume() {

        super.onResume();
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        TextView address = findViewById(R.id.textView);
        address.setText(preferences.getString("userName", "User") + "'s Task");
    }
}