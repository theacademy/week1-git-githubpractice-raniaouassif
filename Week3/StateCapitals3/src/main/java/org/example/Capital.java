package org.example;

public class Capital {
    String name;

    String state;
    int population;
    double squareMileage;

    public Capital(String name, String state, int population, double squareMileage) {
            setName(name);
            setState(state);
            setPopulation(population);
            setSquareMileage(squareMileage);
    }

    //Getter and Setters

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setSquareMileage(double squareMileage) {
        this.squareMileage = squareMileage;
    }

    public double getSquareMileage() {
        return this.squareMileage;
    }

}
