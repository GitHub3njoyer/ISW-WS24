package de.uni.hd.isw.pokemon;
import java.util.Date;

public class Swap {
    private Trainer trainer1;
    private Trainer trainer2;
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private String swapID;
    private static long nextSwapID = 1;
    public Swap(Trainer trainer1,
                Trainer trainer2,
                Pokemon pokemon1,
                Pokemon pokemon2) {
        this.trainer1 = trainer1;
        this.trainer2 = trainer2;
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        swapID = String.valueOf(nextSwapID);
        nextSwapID++;
    }

}
