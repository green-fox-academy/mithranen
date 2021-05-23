package OOP.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Pokemon> pokemonListOfAsh = initializePokemons();

    // Every pokemon has a name and a type.
    // Certain types are effective against others, e.g. water is effective against fire.

    // Ash has a few pokemon.
    // A wild pokemon appeared!

    Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

    // Which pokemon should Ash use?
    // Write the necessary code to get the name of the right pokemon and print it:

    Pokemon result = choosePokemon(pokemonListOfAsh, wildPokemon);

    System.out.print("I choose you, " + result.getName());
  }

  public static Pokemon choosePokemon(List<Pokemon> pokemonList, Pokemon opponentPokemon) {
    boolean isVictoriousPokemon;
    Pokemon victoriousPokemon = null;
    for (Pokemon myPokemon : pokemonList) {
      isVictoriousPokemon = myPokemon.isEffectiveAgainst(opponentPokemon);
      if (isVictoriousPokemon==true) {
        victoriousPokemon = myPokemon;
        break;
      }
    }
    return victoriousPokemon;
  }

  private static List<Pokemon> initializePokemons() {
    List<Pokemon> pokemon = new ArrayList<>();

    pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
    pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
    pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
    pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
    pokemon.add(new Pokemon("Kingler", "water", "fire"));

    return pokemon;
  }
}

