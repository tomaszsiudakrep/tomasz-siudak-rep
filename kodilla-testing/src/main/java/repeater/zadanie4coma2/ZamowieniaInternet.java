package repeater.zadanie4coma2;

public class ZamowieniaInternet {
    private int idZamowienia;
    private String nazwaPrzedmiotu;

    public ZamowieniaInternet(int idZamowienia, String nazwaPrzedmiotu) {
        this.idZamowienia = idZamowienia;
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    @Override
    public String toString() {
        return "ZamowieniaInternet{" +
                "idZamowienia=" + idZamowienia +
                ", nazwaPrzedmiotu=" + nazwaPrzedmiotu +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZamowieniaInternet that = (ZamowieniaInternet) o;

        if (idZamowienia != that.idZamowienia) return false;
        return nazwaPrzedmiotu == that.nazwaPrzedmiotu;
    }


}
