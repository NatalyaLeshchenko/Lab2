package Attacks;

import ru.ifmo.se.pokemon.*;
public class ShadowBall extends SpecialMove {

    public ShadowBall() {
        this.type = Type.GHOST;
        this.accuracy = 100;
        this.power = 80;

    }
    @Override
    protected void applyOppEffects(Pokemon p){


            p.addEffect(new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1));
    }



    @Override
    protected String describe() {
        return "Использует Shadow Ball";
    }}
