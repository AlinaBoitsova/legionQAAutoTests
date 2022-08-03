package homeWork5;

public class Manager extends Employee{

    public Manager(String employeeName, int employeeId, String employeeDateOfBirth) {
        super(employeeName, employeeId,Constants.MANAGER_DEFAULT_SALARY, Constants.MANAGER_TYPE, employeeDateOfBirth);
    }
    public void hireEmployee(String employeeName){
        System.out.println(String.format("The employee %s was hired", employeeName));
    }
    public void fireEmployee(String employeeName){
        System.out.println(String.format("The employee %s was fired", employeeName));
    }
}
