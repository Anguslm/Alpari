package com.spartaglobal.alpari;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
}
