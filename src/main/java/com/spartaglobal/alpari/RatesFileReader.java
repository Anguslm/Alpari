package com.spartaglobal.alpari;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class RatesFileReader {
    private FileReader ratefile;
    public RatesFileReader(String FilePath){
        try {
            ratefile = new FileReader(FilePath);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }

    public FileReader getRatefile() {
        return ratefile;
    }
}
