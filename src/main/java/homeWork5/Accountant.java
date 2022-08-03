package homeWork5;

public class Accountant extends Employee{
    public Accountant(String employeeName, int employeeId, String employeeDateOfBirth) {
        super(employeeName, employeeId,Constants.ACCOUNTANT_DEFAULT_SALARY, Constants.ACCOUNTANT_TYPE, employeeDateOfBirth);
    }

    public void createReport(){
        System.out.println("Report Created");
    }
    public void createNewAccount(int accountNumber){
        System.out.println(String.format("The account %s was created", accountNumber));
    }
    public void closeAccount(int accountNumber){
        System.out.println(String.format("The account %s was closed", accountNumber));
    }
}
