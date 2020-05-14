package com.company;
import org.w3c.dom.ls.LSOutput;

public class GuideDog extends Pet implements voice, jump{
    private boolean Trained = false;


    public GuideDog(int id, int age, float weight, String color, String name, boolean Vaccinated, boolean Trained) {
        super(id, age, weight, color, name, Vaccinated);
        this.Trained = Trained;
    }

    public boolean Trained() {
        return Trained;
    }

    public void setTrained(boolean trained) {
        Trained = trained;
    }

    @Override
    public void voice(){
        if(Trained)
            System.out.println("I can take you home");
        else
            System.out.println("Hello, my name is " + getName() + " woof");
    }
    @Override
    public void doBackFlip(){
        if(Trained)
            System.out.println("Ale op! My name is " + getName() + ". I Have done a backflip");
        else
            System.out.println("Ouch, My name is " + getName() + ". I am not trained to do a backflip");
    }

}