import model.Pokemon;
import model.Move;
import repository.PokemonRepository;
import service.DamageCalculator;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pokemon> pokemons = PokemonRepository.getAllPokemon();

        System.out.println("Escolha seu Pokémon:");
        for (int i = 0; i < pokemons.size(); i++) {
            System.out.println((i + 1) + ". " + pokemons.get(i).getName());
        }
        int escolhaUsuario = scanner.nextInt() - 1;
        Pokemon jogador = pokemons.get(escolhaUsuario);

        System.out.println("Escolha o Pokémon oponente:");
        for (int i = 0; i < pokemons.size(); i++) {
            System.out.println((i + 1) + ". " + pokemons.get(i).getName());
        }
        int escolhaOponente = scanner.nextInt() - 1;
        Pokemon oponente = pokemons.get(escolhaOponente);

        Move tackle = new Move("Tackle", "Normal", 40, true);

        int damage = DamageCalculator.calculateDamage(jogador, oponente, tackle, false);

        System.out.println(jogador.getName() + " causou " + damage + " de dano em " + oponente.getName() + "!");
    }
}