package com.kodilla.testing.wyplata;

public abstract class ObslugaWyplat {

    private KalkulatorPensji kalkulatorPensji;

    public ObslugaWyplat(KalkulatorPensji kalkulatorPensji) {
        this.kalkulatorPensji = kalkulatorPensji;
    }

    protected abstract  void laczenieZBankiem();

    public void robPrzelew() {
        System.out.println("Pensja w kwocie = " + this.kalkulatorPensji.obliczPensje());
        this.laczenieZBankiem();
        System.out.println("Przelew wykonany");
    }
}
