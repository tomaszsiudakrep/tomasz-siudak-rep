package repeater.zadanie1coma5;

public class PracownikUmowaStalaPlusBonus implements PracownikPracownik{

    private double stalaPensjaPracownika;
    private boolean zrobionaSprzedaz;

    public PracownikUmowaStalaPlusBonus(double stalaPensjaPracownika, boolean zrobionaSprzedaz) {
        this.stalaPensjaPracownika = stalaPensjaPracownika;
        this.zrobionaSprzedaz = zrobionaSprzedaz;
    }

    @Override
    public double obliczWyplate() {
        if(zrobionaSprzedaz) {
            return this.stalaPensjaPracownika + this.stalaPensjaPracownika * 0.2;
        } else {
            return this.stalaPensjaPracownika;
        }
    }
}
