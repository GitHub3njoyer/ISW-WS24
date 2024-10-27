package de.uni.hd.isw.pokemon;
import java.util.ArrayList;

public class Pokemon {
    private String name;
    private Type type;
    private int number;
    private static int nextNumber = 1;
    protected Trainer trainer = null;
    protected ArrayList<Swap> swaps = new ArrayList<>();
    protected boolean isSwapAllowed = false;


    //Create Pokemon inb Termianl
    Pokemon(String name, Type type) {
        this.name = name;
        this.type = type;
        this.number = nextNumber;
        nextNumber++;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Type getType() {
        return type;
    }

    //Edit Pokemon in Terminal
    public void setType(Type type) {
        this.type = type;
    }
    public void setName(String name) {
        this.name = name;
        //this ist das Objekt selber, auf der die Operation ausgeführt wird.
    }


    //Show Pokemon Details in Terminal
    public String toString() {
        return "Name: " + this.name + "; Type: " + this.type + "; ID: " + this.number;
    }

    //Link Pokemon to Trainer in Terminal
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}