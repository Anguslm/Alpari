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
    }
}
