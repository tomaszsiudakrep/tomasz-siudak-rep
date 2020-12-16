package repeater.zadanie3coma4;

public class App {
    public static void main(String[] args) {

        KolejkaStosu kolejkaStosu = new KolejkaStosu();
        kolejkaStosu.newTekst();

        Rozdzielenie rozdzielenie = new Rozdzielenie();
        rozdzielenie.rozdzielenie(kolejkaStosu.kolejka1);
    }

}
