package Attacks;
import ru.ifmo.se.pokemon.*;

public class GrassWhistle extends SpecialMove {
    public GrassWhistle() {
        this.type = Type.GRASS;
        this.accuracy = 55;

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.sleep(p);
    }
    @Override
    protected String describe() {
        return "использовал Grass Whistle";
    }}


