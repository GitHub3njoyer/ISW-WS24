package de.uni.hd.isw.pokemon;
import java.util.ArrayList;

public class Pokemon {
    private String name;
    private Type type;
    private int number;
    private static int nextNumber = 1;
    private Trainer trainer = null;

    // list of swaps that the pokemon took part in
    private ArrayList<Swap> swaps = new ArrayList<Swap>();

    private boolean isSwapAllowed = true;

    //Create Pokemon in Terminal
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

    public Trainer getTrainer() {return trainer;}
    //Link Pokemon to Trainer in Terminal
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setSwapAllowed(boolean value) {isSwapAllowed = value;}

    /**
     * Gets the value of isSwapAllowed
     * @return true if and only if swap is allowed for this pokemon
     */
    public boolean isSwapAllowed() {return isSwapAllowed;}

    /**
     * adds swap object to the pokemon
      * @param swap object to be added
     */
    public void addSwap(Swap swap) {
        swaps.add(swap);
    }



    public static void main(String[] args) {
        Pokemon Shiggy;
        Shiggy = new Pokemon("Shiggy", Type.WATER);
        Pokemon Glumanda = new Pokemon("Glumanda", Type.FIRE);
        System.out.println(Shiggy);
        System.out.println(Glumanda);
    }
}