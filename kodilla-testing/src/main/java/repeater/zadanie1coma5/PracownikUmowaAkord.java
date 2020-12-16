package repeater.zadanie1coma5;

public class PracownikUmowaAkord implements PracownikPracownik{

    private double godzinyPrzepracowane;
    private double stawkaGodzinowa;

    public PracownikUmowaAkord(double godzinyPrzepracowane, double stawkaGodzinowa) {
        this.godzinyPrzepracowane = godzinyPrzepracowane;
        this.stawkaGodzinowa = stawkaGodzinowa;
    }

    @Override
    public double obliczWyplate() {
        return this.godzinyPrzepracowane * this.stawkaGodzinowa;
    }
}
