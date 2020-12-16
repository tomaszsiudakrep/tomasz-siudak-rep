package com.kodilla.testing.repeatmodule;

public class Ksiazka {
    String author;
    String title;

    public Ksiazka(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ksiazka ksiazka = (Ksiazka) o;

        if (author != null ? !author.equals(ksiazka.author) : ksiazka.author != null) return false;
        return title != null ? title.equals(ksiazka.title) : ksiazka.title == null;
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
