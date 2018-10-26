package com.example.badhrisridharan.hustlershub;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void studentLogin(View v){
        setContentView(R.layout.student_activity);
    }
    public void staffLogin(View v){
        setContentView(R.layout.staff_activity);
    }
    public void standardPage(View v)
    {
        setContentView(R.layout.staff_activity_standards);
    }
    public void submitDetails(View v)
    {
        setContentView(R.layout.submit_page);
    }
}
