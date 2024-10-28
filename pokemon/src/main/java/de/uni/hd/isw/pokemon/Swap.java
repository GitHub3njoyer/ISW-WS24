package de.uni.hd.isw.pokemon;
import java.util.Date;

public class Swap {
    private Trainer trainer1;
    private Trainer trainer2;
    private Pokemon pokemon1;
    private Pokemon pokemon2;

    // swap date
    private Date date;

    //unique swap ID
    private String swapID;
    private static long nextSwapID = 1;
    public Swap() {
        swapID = String.valueOf(nextSwapID);
        nextSwapID++;
    }

    /**
     * swaps Pokemons
     */
    public void execute(Pokemon pokemon1, Pokemon pokemon2)
    {
        if (!pokemon1.isSwapAllowed() || !pokemon2.isSwapAllowed()) {
            throw new IllegalArgumentException("swap not allowed if not enabled for both pokemons");
        }
        if (pokemon1.getTrainer() == pokemon2.getTrainer()) {
            throw new IllegalArgumentException("swap not allowed for same trainers");

        }

        // date of the swap execution
        date = new Date();

        // set the trainers taking part at the swap
        trainer1 = pokemon1.getTrainer();
        trainer2 = pokemon2.getTrainer();

        // set pokemons taking part at the swap
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;

        // remove pokemon1 from trainer1 and add it to trainer2
        trainer1.removePokemon(pokemon1);
        trainer2.addPokemon(pokemon1);

        // remove pokemon2 from trainer2 and add it to trainer1
        trainer2.removePokemon(pokemon2);
        trainer1.addPokemon(pokemon2);

        pokemon1.addSwap(this);
        pokemon2.addSwap(this);
    }
    public String toString() {
        return "Swap ID: " + swapID + ", " +
                "Swap date: " + date.toString() + ", " +
                "pokemon : " + pokemon1.toString() + ", " +
                "pokemon 2: " + pokemon2.toString() + ", " +
                "trainer 1: " + trainer1.toString() + ", " +
                "trainer 2: " + trainer2.toString();
    }
}
