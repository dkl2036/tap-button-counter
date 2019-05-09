package com.example.tapbuttoncountermainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Model
    private Counter count;

    //View
    private TextView countView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_layout);

            count = new Counter();
            countView = (TextView) findViewById(R.id.textView);
        }
        public void countTap(View view){
            count.addCount();
            countView.setText(count.getCount().toString());
        }
        public void subtractTap(View view){
            count.subtractCount();
            countView.setText(count.getCount().toString());
        }

    }
