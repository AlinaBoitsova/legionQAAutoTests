package BooksStoreOOP;

public class BooksStoreMain {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K Rowling", 1, 10.5, false);
        Book book2 = new Book("Anna Korenina", "L. Tostoy", 2, 20,true);

        book1.setAvailable(true); //этим возможно заменить значения указанные в объекте
        book2.setUsdPrice(30);

        book1.printBookDetails();
        book2.printBookDetails();

    }
}
