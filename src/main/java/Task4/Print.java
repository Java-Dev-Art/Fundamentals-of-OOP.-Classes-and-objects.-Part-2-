package Task4;

import java.util.Arrays;
import java.util.List;

public class Print {
    private Author author;
    private Book book;
    private Library library;

    public Print(Library library) {
        this.library = library;
    }

    public Print(Author author) {
        this.author = author;
    }

    public Print(Book book) {
        this.book = book;
    }

    public Print(Author author, Book book) {
        this.author = author;
        this.book = book;
    }

    public void printBook(){
        System.out.println(book);
    }
    public void printAuthor(){
        System.out.println(book);
    }
    public void printAllBook(){
        System.out.println(Arrays.toString(new List[]{library.getBooks()}));
    }


}
