package Task4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library() {
        books = new ArrayList<>();
    }
    public boolean addBook(Book book){
       return books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
    public Book findBook(Book book){
        int index = 0;
        for (int i = 0;i< books.size();i++){
            if (book.equals(books.get(i))){
                index = i;
            }
        }
        return books.get(index);
    }
    public Book findOfAuthor(Author author){
        int index = 0;
        for (int i = 0;i< books.size();i++){
            if (author.equals(books.get(i).getAuthor())){
                index = i;
            }
        }
        return books.get(index);
    }
}
