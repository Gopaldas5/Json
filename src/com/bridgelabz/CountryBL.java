package com.bridgelabz;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public class CountryBL {
    public static  void main(String[] args) {

        Country country = new Country();
        country.setName("India");
        country.setPopulation(100000);
        List nameOfState = new ArrayList<>();
        nameOfState.add("Sikkim");
        nameOfState.add("Goa");
        nameOfState.add("Bihar");
        nameOfState.add("West bengal");

        country.setNameOfState(nameOfState);
        Gson gson = new Gson();
        String json = gson.toJson(country);
        try {
            FileWriter writer = new FileWriter("E:lisa.json");
            writer.write(json);
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(json);
    }
}
