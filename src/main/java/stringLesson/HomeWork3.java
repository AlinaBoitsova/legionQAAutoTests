package stringLesson;


public class HomeWork3 {
    public String f = null;
    public String g = "something";
    public String text = "racecar";

    public static void main(String[] args) {
        HomeWork3 task1 = new HomeWork3();
        task1.stringTask1();
        HomeWork3 task2 = new HomeWork3();
        task2.stringTask2();
        HomeWork3 task3 = new HomeWork3();
        task3.compareStrings();
        HomeWork3 task4 = new HomeWork3();
        task4.isPalindrome("racecar");

    }
    public void stringTask1() {
        String a = "cat";
        String b = "catalog";
        if (b.contains(a)) {
            System.out.println("Cat is the part of Category ");
        }
    }
    public void stringTask2() {
        String a = "cat";
        String b = "cat";
        if (a.equals(b)) {
            System.out.println("The Strings are the same");
        }
    }
    public void compareStrings(){
        if (f == null || g == null) {
            System.out.println("Cannot compare Strings");
        }
    }

    public boolean isPalindrome (String text) {
        String result = "";
            int lastLetter = text.length() - 1;
            boolean equals = result.equals(text);
            for (int i = lastLetter; i >= 0; i--)
                result = result + text.charAt(i); {
                    if (result.equals(text)) {
                        System.out.println("This is palindrome");
                    }
                    else {
                System.out.println("This is not a palindrome");
            }
        }
        return false;
    }
}
