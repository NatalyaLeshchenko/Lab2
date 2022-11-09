package Attacks;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends SpecialMove {
    public DoubleTeam() {
        this.type = Type.NORMAL;

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, +1);
        }
    @Override
    protected String describe() {
        return "использовал Double Team";
    }}

