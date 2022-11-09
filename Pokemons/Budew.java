package Pokemons;

import Attacks.ShadowBall;
import Attacks.Venoshock;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Budew extends Pokemon{
    public Budew (String name,int level){
        super(name, level);

        this.addType(Type.GRASS);
        this.addType(Type.POISON);

        this.setStats(40, 30, 35, 50, 70, 55);


        this.setMove(new ShadowBall(), new Venoshock());
    }
}