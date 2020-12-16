package com.kodilla.testing.wyplata;

public class GodzinowaPensja implements KalkulatorPensji{

    private double godziny;
    private double stawka;

    public GodzinowaPensja(double godziny, double stawka) {
        this.godziny = godziny;
        this.stawka = stawka;
    }

    @Override
    public double obliczPensje() {
        if(godziny > 200) {
            return this.godziny * (this.stawka + 2.5);
        } else {
            return this.stawka * this.godziny;
        }
    }
}
