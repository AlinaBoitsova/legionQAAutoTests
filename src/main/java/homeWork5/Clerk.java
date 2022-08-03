package homeWork5;

public class Clerk extends Employee{
    public Clerk(String employeeName, int employeeId, String employeeDateOfBirth) {
        super(employeeName, employeeId, Constants.CLERK_DEFAULT_SALARY, Constants.CLERK_TYPE, employeeDateOfBirth);
    }

    public void makeCall(String customerName){
        System.out.println(String.format("Connect to customer %s", customerName));
    }
    public void getCall(String customerName){
        System.out.println(String.format("Answer to customer %s", customerName));
    }
}
