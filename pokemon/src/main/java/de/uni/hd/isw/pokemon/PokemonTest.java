package de.uni.hd.isw.pokemon;

public class PokemonTest {


    public static void test1 () {
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

    public static void test2 () {
        Trainer ash = new Trainer("Ash", "ketchum");
        Pokemon glumanda = new Pokemon("glumanda", Type.FIRE);
        Pokemon bisasam = new Pokemon("bisasam", Type.POISON);

        // Test of addPokemon
        System.out.println("Test of addPokeon");
        ash.addPokemon(glumanda);
        ash.addPokemon(bisasam);
        ash.showPokemons();
        System.out.println();

        // Test of showPokemonsByType
        System.out.println("Test of showPokemonsByType");
        System.out.println("Ausgabe von FIRE Pokemons von Ash");
        ash.showPokemonsByType(Type.FIRE);
        System.out.println("Ausgabe von POISON Pokemons von Ash");
        ash.showPokemonsByType(Type.POISON);
        System.out.println("Ausgabe von WATER Pokemons von Ash");
        ash.showPokemonsByType(Type.WATER);
        System.out.println();

        // Test of i-thPokemon
        System.out.println("Test of showIthPokemon");
        System.out.println("Ausgabe des ersten Pokemons von Ash");
        ash.showIthPokemon(0);
        System.out.println("Ausgabe des zweiten Pokemon von Ash");
        ash.showIthPokemon(1);


        // Aufgabe 2.2 - Testing swapping pokemons
        System.out.println();
        System.out.println("Aufgabe 2.2 - Testing Swapping Pokemons");
        Trainer t1 = new Trainer("Igor", "Dimitrov");
        Trainer t2 = new Trainer("Malte", "Herzog");
        Pokemon p1 = new Pokemon("pokemon 1", Type.POISON);
        Pokemon p2 = new Pokemon("pokemon 2", Type.FIRE);
        t1.addPokemon(p1);
        t2.addPokemon(p2);
        System.out.println("\nCase: swap not allowed for both pokemons: ");
        p1.setSwapAllowed(false);
        p2.setSwapAllowed(false);
        try {
            Swap s = new Swap();
            s.execute(p1, p2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nCase: swap not allowed for one of the pokemons: ");
        p1.setSwapAllowed(true);
        try {
            Swap s = new Swap();
            s.execute(p1, p2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nCase: swap allowed for both pokemons: ");
        p2.setSwapAllowed(true);
        try {
            Swap s = new Swap();
            s.execute(p1, p2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("pokemons of t1: (Expected pokemon2)");
        t1.showPokemons();
        System.out.println("Trainer of p1: (Expected Malte Herzog)");
        System.out.println(p1.getTrainer());

        System.out.println("pokemons of t2: (Expected pokemon1)");
        t2.showPokemons();
        System.out.println("Trainer of p2: (Expected Igor Dimitrov)");
        System.out.println(p2.getTrainer());

        System.out.println("\nCase: swapping pokemons with the same trainer");
        Pokemon p3 = new Pokemon("pokemon 3", Type.FIRE);
        t1.addPokemon(p3);
        try {
            Swap s = new Swap();
            s.execute(p2, p3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) {
        test2();
    }
}
