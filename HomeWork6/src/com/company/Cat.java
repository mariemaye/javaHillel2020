package com.company;

public class Cat extends Pet implements voice {
    public Cat(int id, int age, float weight, String color, String name, boolean Vaccinated) {
        super(id, age, weight, color, name, Vaccinated);
    }

    @Override
    public void voice(){
        System.out.println("Hello, my name is " + getName() + ", Meow");
    }
}

