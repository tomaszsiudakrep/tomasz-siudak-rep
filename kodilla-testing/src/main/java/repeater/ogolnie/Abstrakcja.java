package repeater.ogolnie;

public abstract class Abstrakcja {
    Metody metody;

    public Abstrakcja(Metody metody) {
        this.metody = metody;
    }

    abstract protected void bank();

    public void obliczHajs() {
        System.out.println("Trwa generowanie wypłaty");
        this.bank();
        System.out.println("Gotowe !");
    }

}
