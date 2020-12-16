package repeater.zadanie2coma6;

public class Oceny {

    public double it;
    double math;
    double physics;
    double wf;

    public Oceny(double it, double math, double physics, double wf) {
        this.it = it;
        this.math = math;
        this.physics = physics;
        this.wf = wf;
    }

    @Override
    public String toString() {
        return "Oceny{" +
                "it=" + it +
                ", math=" + math +
                ", physics=" + physics +
                ", wf=" + wf +
                '}';
    }

    public double obliczSrednia() {
        return (this.it + this.wf + this.physics + this.math) / 4;
    }
}
