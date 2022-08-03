package stringLesson;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Vasiliy";
        String gender = "male";
        int age = 20;
        double salsry = 5000.50d;
        System.out.println("The name is " + name + ", gender is " + gender + ", age is " + age + ", salary is "+ salsry);
        System.out.println(String.format("the name is %s, the gender is %s, the age is %d, the salary is %f",name, gender, age, salsry));
    }
}
