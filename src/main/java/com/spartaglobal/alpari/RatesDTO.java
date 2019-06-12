package com.spartaglobal.alpari;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

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
    public Date getDate(){
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
        Date date= new Date();
        try {
            date =formatter.parse((String)fullRatesFile.get("date"));
        }
        catch (java.text.ParseException p){
            p.printStackTrace();
        }
        return date;
    }
}
