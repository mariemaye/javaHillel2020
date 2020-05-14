package com.company;

public class Giraffe extends Wild implements voice {
    public Giraffe(int id, int age, float weight, String color, boolean Predator) {
        super(id, age, weight, color, Predator);
    }

    @Override
    public void voice(){
        System.out.println("Hello, I am a wild animal");
    }

    @Override
    public void setPredator(boolean predator) {
        super.setPredator(false);
    }
}