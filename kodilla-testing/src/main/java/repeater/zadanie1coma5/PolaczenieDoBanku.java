package repeater.zadanie1coma5;

public class PolaczenieDoBanku extends ProcesWyplaty{

    public PolaczenieDoBanku(PracownikPracownik pracownikPracownik) {
        super(pracownikPracownik);
    }

    @Override
    protected void wyslijPrzelew() {
        System.out.println("Lączę z bankiem...Proszę czekać !");
    }
}
