package com.kodilla.testing.pensjePracownikow;

public class StalaPensja implements Pracownik{

    private double stalaWyplata;

    public StalaPensja(double stalaWyplata) {
        this.stalaWyplata = stalaWyplata;
    }

    @Override
    public double obliczWyplate() {
        return this.stalaWyplata;
    }
}
