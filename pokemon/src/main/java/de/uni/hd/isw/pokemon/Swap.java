package de.uni.hd.isw.pokemon;

import java.util.Date;

public class Swap {
    private Date date;
    private String ID;

    Swap(String id) {
        this.ID = id;
        date = new Date();
    }

    public void execute(Pokemon p1, Pokemon p2) {

        //fuer den Fall wenn man zwei Pokemons tauscht die den selben Trainer haben
        try {
            if (p1.trainer == p2.trainer) {
                throw new Exception("Pokemon " + p1.getName() + " kann nicht mit " + p2.getName() + " getauscht werden, da beide den/die TrainerIn " + p1.trainer.getName() + " haben");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //fuer den Fall, p1 ist nicht tauschbar (isSwapAllowed == false)
        try {
            if (!p1.isSwapAllowed) {
                throw new Exception("Pokemon " + p1.getName() + " ist nicht zum Tauschen freigegeben!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //fuer den Fall, p2 ist nicht tauschbar (isSwapAllowed == false)
        try {
            if (!p2.isSwapAllowed) {
                throw new Exception("Pokemon " + p2.getName() + " ist nicht zum Tauschen freigegeben!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Swap Liste von den Zwei Pokemons wird abgepasst und dieser Swap hinzugefügt
        p1.swaps.add(this);
        p2.swaps.add(this);

        // mittels addPokemon und removePokemon die in der Klasse Trainer definiert sind kann man die Pokemons tauschen lassen
        Trainer temp = p2.trainer;
        p1.trainer.addPokemon(p2.trainer.removePokemon(p2));
        temp.addPokemon(p1.trainer.removePokemon(p1));
    }
}
