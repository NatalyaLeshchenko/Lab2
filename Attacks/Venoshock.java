package Attacks;
import ru.ifmo.se.pokemon.*;

public class Venoshock extends PhysicalMove {
    public Venoshock() {
        this.type = Type.POISON;
        this.accuracy = 100;
        this.power = 65;

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (p.getCondition() == Status.POISON) {
            this.power = 130;
        }
        }
    @Override
    protected String describe() {
        return "использовал Venoshock";
    }}
