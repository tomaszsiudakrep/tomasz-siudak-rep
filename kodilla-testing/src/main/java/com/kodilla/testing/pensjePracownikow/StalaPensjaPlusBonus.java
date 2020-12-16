package com.kodilla.testing.pensjePracownikow;

public class StalaPensjaPlusBonus implements Pracownik {

    private double stalaWyplataIBonus;
    private boolean bonus;

    public StalaPensjaPlusBonus(double stalaWyplataIBonus, boolean bonus) {
        this.stalaWyplataIBonus = stalaWyplataIBonus;
        this.bonus = bonus;
    }

    @Override
    public double obliczWyplate() {
        if(bonus) {
            return this.stalaWyplataIBonus + this.stalaWyplataIBonus * 0.2;
        } else {
            return this.stalaWyplataIBonus;
        }
    }
}
