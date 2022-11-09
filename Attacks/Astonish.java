package Attacks;
import ru.ifmo.se.pokemon.*;

public class Astonish extends SpecialMove {
    public Astonish() {
        this.type = Type.GHOST;
        this.accuracy = 100;
        this.power = 30;

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (new Effect().chance(0.3).success()) {
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe() {
        return "использовал Ice Beam";
    }}
