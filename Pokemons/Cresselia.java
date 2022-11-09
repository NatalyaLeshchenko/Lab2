package Pokemons;

import Attacks.ShadowBall;
import Attacks.Facade;
import Attacks.IceBeam;
import Attacks.Slash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cresselia extends Pokemon{
    public Cresselia (String name,int level){
        super(name, level);

        this.addType(Type.PSYCHIC);

        this.setStats(120, 70, 120, 75, 130, 85);


        this.setMove(new ShadowBall(), new Facade(), new IceBeam(), new Slash());
    }
}