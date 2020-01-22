package com.example.weatherhistory.ui.onthisday;

import org.junit.Test;

import static org.junit.Assert.*;

public class OnThisDayFragmentTest {

    /*
    * test not working, can't work out how to structure test on this method
    *
    * */

    @Test
    public void getWeather() {
        String inputA = "50.380805";
        String inputB = "-4.134861";
        String output;
        String expected = "200";

        OnThisDayFragment onThisDayFragment = new OnThisDayFragment();
        onThisDayFragment.getWeather(inputA,inputB);
        output = onThisDayFragment.getResult();

        assertEquals(expected,output);
    }
}