package com.company;

public abstract class Wild extends Animal {
    private boolean Predator = false;

    public Wild(int id, int age, float weight, String color, boolean Predator) {
        super(id, age, weight, color);
        this.Predator = Predator;
    }

    public boolean Predator() {
        return Predator;
    }

    public void setPredator(boolean predator) {
        Predator = predator;
    }
}