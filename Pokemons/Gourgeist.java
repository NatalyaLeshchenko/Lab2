package Pokemons;

import Attacks.WillOWisp;
import Attacks.DoubleTeam;
import Attacks.Astonish;
import Attacks.FocusBlast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gourgeist extends Pokemon{
    public Gourgeist (String name,int level){
        super(name, level);

        this.addType(Type.GHOST);
        this.addType(Type.GRASS);

        this.setStats(65, 90, 122, 58, 75, 84);


        this.setMove(new WillOWisp(), new DoubleTeam(), new Astonish(), new FocusBlast());}}
