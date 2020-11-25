package com.example.shalomconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "HelloToast");
        mShowCount = (TextView) findViewById(R.id.show_count);
        mZero = (Button) findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mCount % 2 == 0) {
            view.setBackgroundColor(getResources().getColor(R.color.teal_200));
        } else {
            view.setBackgroundColor(getResources().getColor(R.color.purple_500));
        }
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        if (mZero != null)
            mZero.setBackgroundColor(getResources().getColor(R.color.orange));
    }

    public void setZero(View view) {
        mCount = 0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        view.setBackgroundColor(getResources().getColor(R.color.grey));
    }
}