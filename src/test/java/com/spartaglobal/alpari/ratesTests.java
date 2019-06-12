package com.spartaglobal.alpari;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ratesTests {
    RatesDTO rates;
    @Before
    public void setup(){
        rates = new RatesDTO("resources/rates.JSON");
    }
    @Test
    public void testSuccessResponse(){
        Assert.assertTrue(rates.getSuccessValue());
    }
    @Test
    public void testTimeStamp(){
        Assert.assertEquals(rates.getTimeStamp(),1539182646);
    }
    @Test
    public void testBaseCurrency(){
        Assert.assertEquals(rates.getBaseCurrency(),"EUR");
    }
    @Test
    public void testDate(){
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
        Date testdate= new Date();
        try {
            testdate =formatter.parse("2018-10-10");
        }
        catch (java.text.ParseException p){
            p.printStackTrace();
        }
        Assert.assertEquals(rates.getDate(),testdate);
    }
}
