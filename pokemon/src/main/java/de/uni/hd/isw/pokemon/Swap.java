package de.uni.hd.isw.pokemon;

import java.util.Date;

public class Swap {
    private Trainer trainer1;
    private Trainer trainer2;
    private Pokemon pokemon1;
    private Pokemon pokemon2;

    private Date date;
    private String id;
    private static int nextID = 1;

    Swap() {
        this.id = String.valueOf(nextID);
        nextID++;
    }

    public void execute(Pokemon p1, Pokemon p2) {

        //try and catch in die main methode packen, hier nur exceptions throwen

        //fuer den Fall wenn man zwei Pokemons tauscht die den selben Trainer haben
        if (p1.trainer == p2.trainer) {
            throw new IllegalArgumentException("Pokemon " + p1.getName() + " kann nicht mit " + p2.getName() + " getauscht werden, da beide den/die TrainerIn " + p1.trainer.getName() + " haben");
        }

        //fuer den Fall, p1 ist nicht tauschbar (isSwapAllowed == false)
        if (!p1.isSwapAllowed) {
            throw new IllegalArgumentException("Pokemon " + p1.getName() + " ist nicht zum Tauschen freigegeben!");
        }

        //fuer den Fall, p2 ist nicht tauschbar (isSwapAllowed == false)
        if (!p2.isSwapAllowed) {
            throw new IllegalArgumentException("Pokemon " + p2.getName() + " ist nicht zum Tauschen freigegeben!");
        }

        // Pokemons und trainer den membern zuordnen
        this.trainer1 = p1.trainer;
        this.trainer2 = p2.trainer;
        this.pokemon1 = p1;
        this.pokemon2 = p2;

        // Swap Liste von den Zwei Pokemons wird abgepasst und dieser Swap hinzugefügt
        p1.swaps.add(this);
        p2.swaps.add(this);

        // mittels addPokemon und removePokemon die in der Klasse Trainer definiert sind kann man die Pokemons tauschen lassen
        Trainer temp = p2.trainer;
        p1.trainer.addPokemon(p2.trainer.removePokemon(p2));
        temp.addPokemon(p1.trainer.removePokemon(p1));

        date = new Date();
    }

    public String toString() {
        return this.trainer1.getName() + " (" + pokemon1.getName() + ")" + " tauscht mit " + trainer2.getName() + " (" + pokemon2.getName() + ")\n" + date + " " + id;
    }
}

/*
Fragen fürs Tut:

1. Warum protected ArrayList<Swap> swaps = new ArrayList<Swap>();?

 */