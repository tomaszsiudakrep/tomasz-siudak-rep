package repeater.ogolnie;

public class FixPensja implements Metody{

    private double h;
    private double hajs;

    public FixPensja(double h, double hajs) {
        this.h = h;
        this.hajs = hajs;
    }

    @Override
    public double obliczPensjeDoWyplaty() {
        return this.h * this.hajs;
    }
}
