package repeater.zadanie2coma5;

public class KsiazkiDostepne {

    String title;
    int year;

    public KsiazkiDostepne(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}
