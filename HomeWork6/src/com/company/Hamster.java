package com.company;
public class Hamster extends Pet implements voice {
    public Hamster(int id, int age, float weight, String color, String name, boolean Vaccinated) {
        super(id, age, weight, color, name, Vaccinated);
    }

    @Override
    public void voice(){
        System.out.println("Hello, my name is " + getName());
    }
}