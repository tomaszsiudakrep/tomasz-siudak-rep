package repeater.ogolnie;

public class FixZBonusem implements Metody{

    private double stalaPensja;
    private boolean bonus;

    public FixZBonusem(double stalaPensja, boolean bonus) {
        this.stalaPensja = stalaPensja;
        this.bonus = bonus;
    }

    @Override
    public double obliczPensjeDoWyplaty() {
        if(bonus) {
            return this.stalaPensja + this.stalaPensja * 0.2;
        } else {
        return this.stalaPensja;
        }
    }

}
