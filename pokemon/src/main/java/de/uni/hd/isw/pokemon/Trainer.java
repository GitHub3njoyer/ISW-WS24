package de.uni.hd.isw.pokemon;
import java.util.ArrayList;

public class Trainer {
    private String fristName;
    private String lastName;
    private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

    Trainer (String first, String last) {
        this.fristName = first;
        this.lastName = last;
    }

    public void addPokemon (Pokemon pokemon) {
        if (pokemon.trainer == null) {
            this.pokemons.add(pokemon);
            pokemon.setTrainer(this);
        } else {
            System.out.println("Pokemon wurde bereits einem Trainer zugewiesen");
        }
    }

    //List Pokemons for Trainer in Terminal
    public void showPokemons () {
        for (Pokemon p: this.pokemons) {
            System.out.println(p);
        }
    }

    //List Pokemons for Trainer by Type in Terminal
    public void showPokemonsByType (Type type) {
        for (Pokemon p: this.pokemons) {
            if (p.getType() == type) {
                System.out.println(p);
            }
        }
    }

    //Show i-th Pokemon for Trainer in Terminal
    public void showIthPokemon (int i) {
        System.out.println(pokemons.get(i));
    }

    //Show Trainer Details in Terminal
    public String toString() {
        return "Name: test jajjafkadölfjasdlkfaf " + fristName + " " +  lastName;
    }

}