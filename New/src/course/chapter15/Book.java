package course.chapter15;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String author;
    private int yearPublished;
    private int numPages;

    public Book(String title, String author, int yearPublished, int numPages) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", numPages=" + numPages +
                '}';
    }
}
