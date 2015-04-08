package com.llama.mathproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MyData";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int x = 5;
        int y = 6;
        int sumValue;
        int diffValue;
        int prodValue;
        double quotValue;

        sumValue = myAdd(x, y);
        Log.i(TAG, "sumValue = " + sumValue);
        diffValue = mySubtract(x, y);
        Log.i(TAG, "diffValue = " + diffValue);
        prodValue = myMultiply(x, y);
        Log.i(TAG, "prodValue = " + prodValue);
        quotValue = myDivide(x, y);
        Log.i(TAG, "quotValue = " + quotValue);
    }

    public int myAdd(int number1, int number2) {

        int sum;
        sum = number1 + number2;

        return sum;
    }

    public int mySubtract(int number1, int number2){
        int diff;
        diff = number1 - number2;
        return diff;
    }

    public int myMultiply(int number1, int number2){
        int product;
        product = number1 * number2;
        return product;
    }

    public double myDivide(int number1, int number2){
        double quotient;
        quotient = (double) number1/number2;
        return  quotient;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
