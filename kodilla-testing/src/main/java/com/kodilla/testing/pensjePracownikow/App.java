package com.kodilla.testing.pensjePracownikow;

public class App {

    public static void main(String[] args) {

        StalaPensjaPlusBonus stalaPensjaPlusBonus = new StalaPensjaPlusBonus(10000, true);

      PolaczenieZBankiem polaczenieZBankiem = new PolaczenieZBankiem(stalaPensjaPlusBonus);
      polaczenieZBankiem.robimyWyplate();

    }
}
