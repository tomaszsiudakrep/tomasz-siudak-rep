package com.kodilla.testing.pensjePracownikow;

public class PensjaZaProdukt implements Pracownik{

    private int iloscProduktu;
    private double kwotaZaJedenProdukt = 5;

    public PensjaZaProdukt(int iloscProduktu) {
        this.iloscProduktu = iloscProduktu;
    }

    @Override
    public double obliczWyplate() {
        return this.iloscProduktu * this.kwotaZaJedenProdukt;
    }
}
