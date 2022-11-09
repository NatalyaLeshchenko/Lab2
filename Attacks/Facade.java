package Attacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        this.type = Type.NORMAL;
        this.accuracy = 100;
        this.power = 70;

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (p.getCondition() == Status.BURN || p.getCondition() == Status.POISON || p.getCondition() == Status.PARALYZE) {
            this.power = 140;
        }
    }
@Override
protected String describe() {
    return "использовал Facade";
}
}