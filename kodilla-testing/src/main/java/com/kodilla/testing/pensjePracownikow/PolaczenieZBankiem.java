package com.kodilla.testing.pensjePracownikow;

public class PolaczenieZBankiem extends ObslugaWyplat{
    public PolaczenieZBankiem(Pracownik pracownik) {
        super(pracownik);
    }

    @Override
    protected void laczenieZBankiem() {
        System.out.println("Proszę czekać..Trwa łączenie z bankiem..");
    }
}
