package Attacks;

import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove {
    public WillOWisp() {
        this.type = Type.FIRE;
        this.accuracy = 85;

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
Effect.burn(p);
        }

    @Override
    protected String describe() {
        return "использовал Will-O-Wisp";
    }}