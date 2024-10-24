package de.uni.hd.isw.pokemon;

public class PokemonTest {


    public static void Test1 () {
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

    public static void Test2 () {
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
        System.out.println();

        // Test of toString Trainer
        System.out.println("Test of toSting");
        System.out.println(ash);

        // Test that a pokemon that belongs to a trainer can't be added to any trainer
        System.out.println("Test that a pokemon that belongs to a trainer can't be added to any trainer:");
        Pokemon p1 = new Pokemon("p1", Type.POISON);
        Trainer t1 = new Trainer("John", "Doe");
        Trainer t2 = new Trainer("Alice", "Smith");
        System.out.println("Test that a pokemon that belongs to a trainer, can't be added to another trainer");
        t1.addPokemon(p1);
        t2.addPokemon(p1);
        System.out.println("Test that a pokemon can't be added to the same trainer twice: ");
        t1.addPokemon(p1);



    }
    public static void main(String[] args) {
        Test2();
    }
}
