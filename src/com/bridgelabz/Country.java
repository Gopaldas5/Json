package com.bridgelabz;

import java.util.List;

public class Country {
    String name;
    int population;
    List nameOfState;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List getNameOfState() {
        return nameOfState;
    }

    public void setNameOfState(List nameOfState) {
        this.nameOfState = nameOfState;
    }
}
