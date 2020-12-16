package com.kodilla.testing.pensjePracownikow;

public class PensjaGodzinowa implements Pracownik {

    private double godzinyPrzepracowane;
    private double stawkaGodzinowa;

    public PensjaGodzinowa(double godzinyPrzepracowane, double stawkaGodzinowa) {
        this.godzinyPrzepracowane = godzinyPrzepracowane;
        this.stawkaGodzinowa = stawkaGodzinowa;
    }

    @Override
    public double obliczWyplate() {
        return this.godzinyPrzepracowane * this.stawkaGodzinowa;
    }
}
