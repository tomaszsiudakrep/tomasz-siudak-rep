package com.kodilla.testing.wyplata;

public class Bank extends ObslugaWyplat{

    public Bank(KalkulatorPensji kalkulatorPensji) {
        super(kalkulatorPensji);
    }

    @Override
    protected void laczenieZBankiem() {
        System.out.println("Proszę czekać..trwa łączenie z bankiem");
    }
}
