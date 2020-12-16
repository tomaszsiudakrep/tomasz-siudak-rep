package repeater.zadanie3coma1;

public class KsiazkiLibrary {

    String tytul;
    String autor;
    int rokWydania;

    public KsiazkiLibrary(String tytul, String autor, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KsiazkiLibrary that = (KsiazkiLibrary) o;

        if (rokWydania != that.rokWydania) return false;
        if (tytul != null ? !tytul.equals(that.tytul) : that.tytul != null) return false;
        return autor != null ? autor.equals(that.autor) : that.autor == null;
    }

    @Override
    public int hashCode() {
        int result = tytul != null ? tytul.hashCode() : 0;
        result = 31 * result + (autor != null ? autor.hashCode() : 0);
        result = 31 * result + rokWydania;
        return result;
    }

    @Override
    public String toString() {
        return "KsiazkiLibrary{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", rokWydania=" + rokWydania +
                '}';
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }
}
