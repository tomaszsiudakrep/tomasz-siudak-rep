package com.kodilla.testing.pensjePracownikow;

public abstract class ObslugaWyplat {

    private Pracownik pracownik;

    public ObslugaWyplat(Pracownik pracownik) {
        this.pracownik = pracownik;
    }

    protected abstract void laczenieZBankiem();

    public void robimyWyplate() {
        System.out.println("Przygotowywanie wyplaty w kwocie: " + this.pracownik.obliczWyplate());
        this.laczenieZBankiem();
        System.out.println("Zrobione!");
    }
}
