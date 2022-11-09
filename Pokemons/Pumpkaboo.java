package Pokemons;

import Attacks.WillOWisp;
import Attacks.DoubleTeam;
import Attacks.Astonish;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pumpkaboo extends Pokemon{
    public Pumpkaboo (String name,int level){
        super(name, level);

        this.addType(Type.GHOST);
        this.addType(Type.GRASS);

        this.setStats(49, 66, 70, 44, 55, 51);


        this.setMove(new WillOWisp(), new DoubleTeam(), new Astonish());
    }
}
