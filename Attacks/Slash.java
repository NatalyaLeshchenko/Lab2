package Attacks;
import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove{
    public Slash(){
        this.type = Type.NORMAL;
        this.power= 70;
                this.accuracy= 100;
    }
@Override
    protected double calcCriticalHit(Pokemon att,
                Pokemon def) {
        return 85d/ 512d ;
}

@Override
protected String describe() {
    return "использовал Slash";
}
}