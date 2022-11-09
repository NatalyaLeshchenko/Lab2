package Attacks;
import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast() {
        this.type = Type.FIGHTING;
        this.accuracy = 70;
        this.power = 120;

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (new Effect().chance(0.1).success()) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe() {
        return "использовал Focus Blast";
    }}

