package lessson2;

public class HomeWork2 {
    public static void main(String[] args) {
        HomeWork2 tasks = new HomeWork2();
        tasks.task1 ();
        tasks.task2(1,3);
        tasks.task3(9);
    }
    public void task1() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("The number " + i + " is divisible by three and two");
            }
            else if (i % 2 == 0) {
                System.out.println("The number " + i + " is even");
            }
            else if (i % 3 == 0) {
                System.out.println("The number " + i + " is divisible by three");
            }
            else {
                System.out.println("The number " + i + " is odd");
            }
        }
    }

    public void task2 (int a, int b) {
        int x = 0;
        for (int i = a; i <= b; i++) {
            x = x+i;
            System.out.println("In loop Result " + x);
        }
        System.out.println("----------------");
        System.out.println("Te final result is " + x);
    }

    public void task3(int rows){
        for (int q = 1; q <= rows; q++) {

            for (int j = 9; j >= q; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
