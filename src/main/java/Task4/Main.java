package Task4;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Markouski","Artur");
        Author author2 = new Author("Bykov","Vladi");
        Author author3 = new Author("Kupala","Janka");
        Author author4 = new Author("Kolas","Jakub");
        Author author5 = new Author("Simpson","Bart");

        Book book1 = new Book(1,"Stok",author1,"Mins",1991,200,2000,"hard");
        Book book2 = new Book(2,"Olsza",author2,"Oszmiana",1981,400,4000,"hard");
        Book book3 = new Book(3,"Wiersz",author3,"Vilno",1921,200,8000,"hard");
        Book book4 = new Book(4,"Ludi na bolocie",author4,"Vilno",1934,400,20000,"hard");
        Book book5 = new Book(1,"The simpsons",author5,"Mins",1991,200,2000,"hard");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);


        System.out.println(library.findBook(book1));

        Print print = new Print(library);
        print.printAllBook();

        Print printBook = new Print(book4);
        printBook.printBook();

        System.out.println(library.findOfAuthor(author3));

    }
}
