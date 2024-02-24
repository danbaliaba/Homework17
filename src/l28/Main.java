package l28;
import l28.Bookshelf;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Bookshelf book = new Bookshelf();
        Bookshelf.Book books;
        books = book.new Book("Me", "You", 2000);
        Bookshelf.Iterator iterator;
        iterator = book.new Iterator();
        book.addBook("Pride and Prejudice ", "Jane Austen", 1813);
        book.addBook("To Kill a Mockingbird ", "Harper Lee", 1960);
        book.addBook("The Great Gatsby ", "F. Scott Fitzgerald", 1925);
        book.addBook("One Hundred Years of Solitude ", "Gabriel García Márquez", 1967);
        book.addBook("In Cold Blood", "Truman Capote", 1965);
        book.addBook("Wide Sargasso Sea ", "Jean Rhys", 1966);
        book.addBook("Brave New World ", "Aldous Huxley", 1932);
        book.removeBook(6);
        iterator.nextBook();
        iterator.nextBook();
        iterator.nextBook();
        iterator.nextBook();
        iterator.nextBook();
        iterator.nextBook();
        iterator.nextBook();
        iterator.showBook();
        iterator.nextBook();
        iterator.showBook();
        iterator.nextBook();
        iterator.showBook();

        book.showBooks();
    }

}
