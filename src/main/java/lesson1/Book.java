package lesson1;

public class Book {
    //describe a book,create all the variables we need
    //name, author, id, price in USD, availability
    // using conversion rate, calculate EURO Price og book
    // print all the book details including price

    public static void main(String[] args) {
//        String bookName = "Harry Potter";
//        String authorName = "J.K. Rowling";
//        int id = 1;
//        double priceInUSD = 10.5;
//        boolean isAvailable = true;
        Book book1 = new Book();
        book1.createNewBook("Harry Potter", "J.K Rowling", 1, 10.5, false);
//        double rate = 1.1;
        book1.createNewBook("Anna Korenina", "L. Tostoy", 2, 20,true);
//
//        double priceInEUR = priceInUSD * rate;
//
//        System.out.println("Book name is: " + bookName);
//        System.out.println("Book id is: " + id);
//        System.out.println("Book price: " + priceInUSD + " USD, " + priceInEUR + "EUR");
//        System.out.println("Book is available: " + isAvailable);

    }

    public void createNewBook(String bookName, String authorName, int id, double priceInUSD,boolean isAvailable){
        double rate = 1.1;
        double priceInEUR = priceInUSD * rate;

        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price: " + priceInUSD + " USD, " + priceInEUR + "EUR");
        System.out.println("Book is available: " + isAvailable);

    }
}
