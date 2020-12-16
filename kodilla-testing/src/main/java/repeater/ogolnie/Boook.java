package repeater.ogolnie;

public class Boook {
    private String title;
    private int year;

    public Boook(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Boook{" +
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Boook boook = (Boook) o;

        if (year != boook.year) return false;
        return title != null ? title.equals(boook.title) : boook.title == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + year;
        return result;
    }
}
