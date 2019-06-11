package com.spartaglobal.alpari;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.IOException;

public class RatesDTO {
    private JSONObject fullRatesFile;
    public RatesDTO(String filePath){
        RatesFileReader ratesFile = new RatesFileReader(filePath);
        JSONParser parser = new JSONParser();
        try {
            Object ratesObj = parser.parse(ratesFile.getRatefile());
            fullRatesFile = (JSONObject) ratesObj;
        }
        catch (ParseException | IOException e){
            e.printStackTrace();
        }
    }
    public void printRate(){
        System.out.println(fullRatesFile);
    }
    public boolean getSuccessValue(){
        return (boolean)fullRatesFile.get("success");
    }
    public long getTimeStamp(){
        return (long)fullRatesFile.get("timestamp");
    }
    public String getBaseCurrency(){
        return (String)fullRatesFile.get("base");
    }
}
