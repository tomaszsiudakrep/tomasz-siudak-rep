package repeater.zadanie2coma5;

public class App {
    public static void main(String[] args) {

        SkrajneUsuwamy skrajneUsuwamy = new SkrajneUsuwamy();
        skrajneUsuwamy.wstawianieOcenDoListy();
        skrajneUsuwamy.SearchAndRemoveExtreme();
        skrajneUsuwamy.obliczenieSredniejOcenIT();


        KsiazkiWBibliotece ksiazkiWBibliotece = new KsiazkiWBibliotece();
        ksiazkiWBibliotece.dodawanieKsiazekDoListy();
        ksiazkiWBibliotece.pokazKsiazkiPo2000Roku();
    }

}
