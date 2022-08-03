package homeWork5;

public class BankAppMain {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith",1,"10.01.1977");
        Accountant accountant1 = new Accountant("Mary Jones",2,"09.08.2005");
        Accountant accountant2 = new Accountant("Toby Flanders",3,"17.12.1998");
        Accountant accountant3 = new Accountant("Gomer Simpson", 4, "30.10.2000");
        Accountant accountant4 = new Accountant("Taylor Swift", 5, "02.11.1997");
        Accountant accountant5 = new Accountant("Happy Cat", 6,"01.02.2010");
        Clerk clerk1 = new Clerk("Sherlock Holms", 7, "18.09.1921");
        Clerk clerk2 = new Clerk("The Rock", 8,"11.11.2011");
        Clerk clerk3 = new Clerk("Vara Vbudushee",9,"12.05.1996");

        System.out.println(manager.toString());
        System.out.println(accountant1.toString());
        System.out.println(accountant2.toString());
        System.out.println(accountant3.toString());
        System.out.println(accountant4.toString());
        System.out.println(accountant5.toString());
        System.out.println(clerk1.toString());
        System.out.println(clerk2.toString());
        System.out.println(clerk3.toString());

        manager.fireEmployee("Taylor Swift");
        accountant1.createReport();
        accountant2.closeAccount(1235);
        accountant4.createNewAccount(888);
        clerk3.makeCall("Any Person");

        accountant1.setName("Mary Whatever");
        System.out.println(accountant1.toString());

    }
}
