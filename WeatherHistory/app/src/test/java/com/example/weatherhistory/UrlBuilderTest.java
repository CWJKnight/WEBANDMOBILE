package com.example.weatherhistory;

import org.junit.Test;

import static org.junit.Assert.*;

public class UrlBuilderTest {

    @Test
    public void buildURL() {
        String inputA = "50.380805";
        String inputB = "-4.134861";
        int inputC = 2;
        String out;
        String expected = "http://api.openweathermap.org/data/2.5/weather?lat=50.380805&lon=-4.134861&APPID=b22765d57f287a740aa4bfcccca160f8&units=metric";

        UrlBuilder urlBuilder = new UrlBuilder();
        out = urlBuilder.buildURL(inputC,inputA,inputB);
        assertEquals(expected,out);
    }
}