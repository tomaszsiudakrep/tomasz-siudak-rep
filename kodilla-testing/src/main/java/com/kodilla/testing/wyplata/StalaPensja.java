package com.kodilla.testing.wyplata;

public class StalaPensja implements KalkulatorPensji{

    private double pensja;
    private boolean bonus;
    private double procentBonus;

    public StalaPensja(double pensja, boolean bonus, double procentBonus) {
        this.pensja = pensja;
        this.bonus = bonus;
        this.procentBonus = procentBonus;
    }

    @Override
    public double obliczPensje() {
        if(bonus) {
            return this.pensja + (this.pensja * (this.procentBonus / 100));
        } else {
            return this.pensja;
        }
    }
}
