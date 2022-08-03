package stringLesson;

public class LoginApp {
    public String expectedUserName = "admin";
    public String expectedPassword = "12345";

    public static void main(String[] args) {
        LoginApp loginApp = new LoginApp();
        boolean success = loginApp.verifyUser("ADMIN", "54321");
        System.out.println("Login success " + success);
        loginApp.strinsExamples();

    }

    public boolean verifyUser(String username, String password) {
        boolean success = false;
        //if(username.isEmpty() || password.isEmpty()){
        if (username == null || password == null) {
            System.out.println("The username or password is null");
        }
        else if (username.length() == 0 || password.length() == 0) {
            System.out.println("The username or password is empty");
        }
        else if (username.isBlank() || password.isBlank()) {
            System.out.println("The username or password is blunk");
        } else if (!username.equalsIgnoreCase(expectedUserName) || !password.equals(expectedPassword)) {
            System.out.println("The username or password does not match");

        } else {
            success = true;
        }
        return success;
    }
    public void strinsExamples(){
        String txt1 = "cat";
        String txt2 = "catalog";
        System.out.println(txt2.contains(txt1));
    }
}

