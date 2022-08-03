package stringLesson;

public class NewBookReturn {
    String euro = "EUR";
    String ruble = "RUB";

        public static void main(String[] args) {

            NewBookReturn Book1 = new NewBookReturn();
            Book1.createNewBook1("Harry Potter", "J.K Rowling", 1, 10.5, false);
            Book1.createNewBook1("Anna Korenina", "L. Tostoy", 2, 20,true);
        }

        public static void createNewBook1(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable){
            double priceInEUR = calculatePrice(priceInUSD, "EUR");
            double priceInRubles = calculatePrice(priceInUSD, "RUB");

            System.out.println("Book name is: " + bookName);
            System.out.println("Book id is: " + id);
//            System.out.println("Book price: " + priceInUSD + " USD, " + priceInEUR + "EUR", + priceInRubles + "RUB");
            System.out.println("Book is available: " + isAvailable);

        }
        public static double calculatePrice(double priceInUSD, String currency){
            double rate = 1;
            if(currency.equals("EUR")){
                rate = 1.1;
            }
            else if (currency.equals("RUB")){
                rate = 70;
            }
            else {
                System.out.println("Error: unknown currency, USD price will be return");
            }
            double priceAfterConversion = priceInUSD * rate;
            return priceAfterConversion;

        }
    }

