package lesson1;

public class HomeWork1 {
    public static void main(String[] args) {

        //задание 1
        String txt = "Hello";
        String txtName = "Alina Boitsova";

        //задание 2
//        int f = -5;
//        int d = 8;
//        int v = 6;
//        int resultA = f + d * v;
        int resultA = -5 + 8 * 6;
        double h = -3;
        double g = 5;
        double j = 8;
        double resultB = 20 + (double) h * (double) g / (double) j;

        //задание 3
        double a = 0.5;
        double b = 1.7;
        double c = 2.55;
        double d = 71.65;
        double e = 9.980654;

        double resultIs = a * b * c * d * e;


        //результат задание 1
        System.out.println(txt);
        System.out.println(txtName);
        //результат задание 2
        System.out.println("Result a is " + resultA);
        System.out.println("Result b is " + resultB);
        //результат задание 3
        System.out.println("Number a * number b * number c * number d * number e = " + resultIs);

    }
}
