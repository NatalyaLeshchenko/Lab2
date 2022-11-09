package Pokemons;

import Attacks.ShadowBall;
import Attacks.Venoshock;
import Attacks.GrassWhistle;
import Attacks.Facade;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roserade extends Pokemon{
    public Roserade (String name,int level){
        super(name, level);

        this.addType(Type.GRASS);
        this.addType(Type.POISON);

        this.setStats(60, 70, 65, 125, 105, 90);


        this.setMove(new ShadowBall(), new Venoshock(), new GrassWhistle(), new Facade());
    }
}