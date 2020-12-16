package repeater.zadanie1coma5;

public abstract class ProcesWyplaty {

    PracownikPracownik pracownikPracownik;

    public ProcesWyplaty(PracownikPracownik pracownikPracownik) {
        this.pracownikPracownik = pracownikPracownik;
    }

    protected abstract void wyslijPrzelew();

    public void proces() {
        System.out.println("Trwa przygotowywania wypłaty w kwocie: " + pracownikPracownik.obliczWyplate());
        this.wyslijPrzelew();
        System.out.println("Wypłata zrealizowana");
    }


}
