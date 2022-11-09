
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import Pokemons.Cresselia;
import Pokemons.Pumpkaboo;
import Pokemons.Roselia;
import Pokemons.Roserade;
import Pokemons.Budew;
import Pokemons.Gourgeist;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class fight {


    public static void main(java.lang.String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Budew("Buda", 6);
        Pokemon p2 = new Roselia("The Queen", 6);
        Pokemon p3 = new Roserade("Rose", 6);
        Pokemon p4 = new Cresselia("Star", 6);
        Pokemon p5 = new Pumpkaboo("Diamond", 6);
        Pokemon p6 = new Gourgeist("Gold Experience", 6);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }


}