package de.uni.hd.isw.pokemon;
import java.util.ArrayList;

public class Trainer {
    private String firstName;
    private String lastName;
    private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

    Trainer (String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    //Link Pokemon to Trainer in Terminal
    public void addPokemon (Pokemon pokemon) {
        if (pokemon.trainer == null) {
            this.pokemons.add(pokemon);
            pokemon.setTrainer(this);
        } else if (pokemon.trainer == this){
            System.out.println("Pokemon ist bereits schon Mitglied von diesem Trainer!");
        } else {
            System.out.println("Pokemon wurde bereits einem Trainer zugewiesen!");
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
        return "Name: " + firstName + " " +  lastName;
    }

}