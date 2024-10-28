package Task7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Title1","Ibrahim"));
        books.add(new Book("Title2","Cuma"));
        books.add(new Book("Title3","Revan"));
        books.add(new Book("Title3","Azer"));

        System.out.println("Books : ");
        for(Book book: books){
            System.out.println(books);
        }

    }
}
