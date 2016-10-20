package com.example.daniel.w1d2_homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ScreenOrientation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_orientation);

        if(getResources().getDisplayMetrics().widthPixels>getResources().getDisplayMetrics().
                heightPixels)
        {
            Toast.makeText(this,"Landscape mode",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Portrait mode",Toast.LENGTH_SHORT).show();
        }

        //function viewed in: http://www.informit.com/articles/article.aspx?p=1970144&seqNum=9

    }
}
