package Pokemons;

import Attacks.ShadowBall;
import Attacks.Venoshock;
import Attacks.GrassWhistle;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roselia extends Pokemon{
    public Roselia (String name,int level){
        super(name, level);

        this.addType(Type.GRASS);
        this.addType(Type.POISON);

        this.setStats(50, 60, 45, 100, 80, 65);


        this.setMove(new ShadowBall(), new Venoshock(), new GrassWhistle());
    }
}