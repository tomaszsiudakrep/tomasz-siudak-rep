package repeater.ogolnie;

public class OcenyUczniow {

    private double fizyka;
    private double matma;
    private double astronomia;

    DaneUczniow daneUczniow;

    public OcenyUczniow(double fizyka, double matma, double astronomia) {
        this.fizyka = fizyka;
        this.matma = matma;
        this.astronomia = astronomia;
    }

    public double sredniaOcenUczniow() {
        return (this.matma + this.astronomia + this.fizyka) / 3;
    }


    public double getFizyka() {
        return fizyka;
    }

    public double getMatma() {
        return matma;
    }

    public double getAstronomia() {
        return astronomia;
    }

    @Override
    public String toString() {
        return "OcenyUczniow{" +
                "fizyka=" + fizyka +
                ", matma=" + matma +
                ", astronomia=" + astronomia +
                '}';
    }
}
