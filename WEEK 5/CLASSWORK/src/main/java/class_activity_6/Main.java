package src.main.java.class_activity_6;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<>();
        books.add(new Book(1,"Book Title 1", "Author 1", 2));
        books.add(new Book(2,"Book Title 2", "Author 2", 1));
        books.add(new Book(3,"Book Title 3", "Author 3", 5));
        books.add(new Book(4,"Book Title 4", "Author 4", 6));
        books.add(new Book(5,"Book Title 5", "Author 5", 2));

        for (Book book : books){
            System.out.println(book.toString());
        }

    }
}
