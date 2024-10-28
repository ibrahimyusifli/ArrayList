package Task7;

public class Book {
    public String title;
    public String author;

    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}
