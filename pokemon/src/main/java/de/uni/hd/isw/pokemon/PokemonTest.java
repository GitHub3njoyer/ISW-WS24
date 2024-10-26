package de.uni.hd.isw.pokemon;

import java.sql.SQLOutput;

public class PokemonTest {


    public static void Test1() {
        // testen vom Konstruktor
        System.out.println("Testen vom Konstruktor:");
        Pokemon p1 = new Pokemon("Apollo", Type.POISON);
        System.out.println("Pokemon wurde vollständig erstellt \n");

        // Test of getter of name
        System.out.println("Testen von getName");
        System.out.println("Name von Pokemon p1:");
        System.out.println(p1.getName() + "\n");

        // Test of setter of name
        System.out.println("Testen von setName");
        System.out.println("Name von Pokemon p1 alt:");
        System.out.println(p1.getName());
        p1.setName("Gengar");
        System.out.println("Name von Pokemon p1 neu:");
        System.out.println(p1.getName() + "\n");

        // Test of getter of type
        System.out.println("Testen von getType");
        System.out.println("Type von Pokemon p1:");
        System.out.println(p1.getType() + "\n");

        // Test of setter of type
        System.out.println("Testen von setType");
        System.out.println("Type von Pokemon p1 alt:");
        System.out.println(p1.getType());
        p1.setType(Type.FIRE);
        System.out.println("Name von Pokemon p1 neu:");
        System.out.println(p1.getType() + "\n");

        // Test of getter of number
        System.out.println("Testen von getNumber");
        System.out.println("Number von Pokemon p1:");
        System.out.println(p1.getNumber() + "\n");

        // Test of toString
        System.out.println("Testen von toString");
        System.out.println(p1.toString());
    }

    public static void Test2() {
        Trainer ash = new Trainer("Ash", "ketchum");
        Pokemon glumanda = new Pokemon("glumanda", Type.FIRE);
        Pokemon bisasam = new Pokemon("bisasam", Type.POISON);

        // #1 Test of addPokemon and showPokemons
        System.out.println("Test of addPokeon");
        ash.addPokemon(glumanda);
        ash.addPokemon(bisasam);
        ash.showPokemons();
        System.out.println();


        // #2 Test of showPokemonsByType
        System.out.println("Test of showPokemonsByType");
        System.out.println("Ausgabe von FIRE Pokemons von Ash");
        ash.showPokemonsByType(Type.FIRE);
        System.out.println("Ausgabe von POISON Pokemons von Ash");
        ash.showPokemonsByType(Type.POISON);
        System.out.println("Ausgabe von WATER Pokemons von Ash");
        ash.showPokemonsByType(Type.WATER);
        System.out.println();

        // #3 Test of i-thPokemon
        System.out.println("Test of showIthPokemon");
        System.out.println("Ausgabe des ersten Pokemons von Ash");
        ash.showIthPokemon(0);
        System.out.println("Ausgabe des zweiten Pokemon von Ash");
        ash.showIthPokemon(1);
        System.out.println();

        // #4 Test of toString Trainer
        System.out.println("Test of toSting ");
        System.out.println(ash);
        System.out.println();

        // #5 Test that a pokemon that belongs to a trainer can't be added to any trainer
        System.out.println("Test that a pokemon that belongs to a trainer can't be added to any trainer:");
        Pokemon p1 = new Pokemon("p1", Type.POISON);
        Trainer t1 = new Trainer("John", "Doe");
        Trainer t2 = new Trainer("Alice", "Smith");
        System.out.println("Test that a pokemon that belongs to a trainer, can't be added to another trainer");
        t1.addPokemon(p1);
        System.out.println("Pokemon p1 wurde zum t1 Trainer hinzugefügt!");
        t2.addPokemon(p1);
        System.out.println("Test that a pokemon can't be added to the same trainer twice: ");
        t1.addPokemon(p1);
    }

    public static void Test3() {

        Trainer t1 = new Trainer("Malte", "Herzog");
        Trainer t2 = new Trainer("Igor", "Dimitrov");
        Pokemon p1 = new Pokemon("Bisasam", Type.POISON);
        Pokemon p2 = new Pokemon("Glumanda", Type.POISON);
        Pokemon p3 = new Pokemon("Schiggy", Type.POISON);
        Pokemon p4 = new Pokemon("Raupy", Type.POISON);
        Pokemon p5 = new Pokemon("Hornliu", Type.POISON);
        Pokemon p6 = new Pokemon("Taubsi", Type.POISON);
        t1.addPokemon(p1);
        t1.addPokemon(p2);
        t1.addPokemon(p3);
        t2.addPokemon(p4);
        t2.addPokemon(p5);
        t2.addPokemon(p6);

        System.out.println("Testen der Swap Funktion in mehreren Szenarien:");
        System.out.println("1. Test: Pokemons tauschen die den selben Trainer haben und die Pokemons sind nicht zum Tausch freigegeben.");
        new Swap("ID: 1").execute(p1, p2);
        System.out.println();

        System.out.println("Pokemons werden absofort zum Tausch freigegeben!");
        p1.isSwapAllowed = true;
        p2.isSwapAllowed = true;
        p3.isSwapAllowed = true;
        p4.isSwapAllowed = true;
        p5.isSwapAllowed = true;
        p6.isSwapAllowed = true;
        System.out.println();

        System.out.println("2. Test: Pokemon Bisasam (t1 Trainer) wird mit Pokemon Raupy getauscht (t2 Trainer)");
        System.out.println("----------------------------");
        System.out.println("Pokemon Listen der Trainer vorher!");
        System.out.println(t1);
        t1.showPokemons();
        System.out.println();
        System.out.println(t2);
        t2.showPokemons();
        System.out.println("---------------------------");
        new Swap("ID: 2").execute(p1, p4);
        System.out.println("Pokemon Listen der Trainer nachher!");
        System.out.println(t1);
        t1.showPokemons();
        System.out.println();
        System.out.println(t2);
        t2.showPokemons();
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Test3();
    }
}
