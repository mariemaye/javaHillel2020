package com.company;
public  abstract class Pet extends Animal{
    private String name;
    private boolean Vaccinated = true;

    public Pet(int id, int age, float weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.Vaccinated = Vaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean Vaccinated() {
        return Vaccinated;
    }

    public void setVaccinated(boolean vaccinated) { Vaccinated = vaccinated;
    }
}