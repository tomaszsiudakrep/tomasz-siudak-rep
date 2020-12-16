package repeater.zadanie1coma5;

public class App {

    public static void main(String[] args) {

        PracownikUmowaAkord pracownikUmowaAkord = new PracownikUmowaAkord(100.0, 50.0);
        PracownikUmowaStalaPlusBonus pracownikUmowaStalaPlusBonus = new PracownikUmowaStalaPlusBonus(3500.0, true);

        PolaczenieDoBanku polaczenieDoBanku = new PolaczenieDoBanku(pracownikUmowaAkord);
        polaczenieDoBanku.proces();

    }

}
