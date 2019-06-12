package com.spartaglobal.alpari;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       RatesDTO rates = new RatesDTO("resources/rates.JSON");

        System.out.println(rates.getSuccessValue());
        System.out.println(rates.getTimeStamp());
        System.out.println(rates.getBaseCurrency());
        System.out.println(rates.getDate());
        System.out.println(rates.TimeStampToDate());
        System.out.println(rates.getSpecificRate("GBP"));
        System.out.println(rates.getRatesKeys().size());
    }
}
