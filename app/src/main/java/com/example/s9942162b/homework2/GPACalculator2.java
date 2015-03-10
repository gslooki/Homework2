package com.example.s9942162b.homework2;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class GPACalculator2 extends ListActivity {
    //Normal Variables
    private Double mGPA;
    //Buttons
    private Button mAddSubject;
    //Lists
    private Subject[] mSubjectList = new Subject[]{
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpacalculator2);
        mAddSubject = (Button)findViewById(R.id.addsubject);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gpacalculator2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private double getGPA(Subject[] subjectList){
        int total = 0;
        int GPA = 0;
        for(int n = 1; n-1<subjectList.length; n++){

        }
        return GPA;
    }
}
