package repeater.zadanie3coma2;

public class Book {
    String title;
    int rok;

    public Book(String title, int rok) {
        this.title = title;
        this.rok = rok;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", rok=" + rok +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (rok != book.rok) return false;
        return title != null ? title.equals(book.title) : book.title == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + rok;
        return result;
    }
}
