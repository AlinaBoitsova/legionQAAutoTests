package lessson2;

public class Lesson2Main {
    public static void main(String[] args) {
        Lesson2Main lesson2 = new Lesson2Main();
        boolean isBounusAvailiable = true;
        lesson2.checkScore("John Doe", 1, 40, isBounusAvailiable);
        lesson2.checkScore("Mark Smith", 2, 50, isBounusAvailiable);
        lesson2.checkScore("Anna Smith", 2, 60, isBounusAvailiable);
        //      lesson2.printUserInfo("John Doe", 1);
//        String userName = "John Doe";
//        int userId = 1;
//        System.out.println("The username is " + userName);
//        System.out.println("The user ID is " + userId);

    }

    public void printUserInfo(String userName, int userId) {

        System.out.println("The username is " + userName);
        System.out.println("The user ID is " + userId);

    }

    public void checkScore(String userName, int userId, int userScore, boolean isBounusAvailiable){
        System.out.println("The username is " + userName);
        System.out.println("The user ID is " + userId);

        if(userName.equals("John Doe")) {
            userScore = userScore + 20;
        }

        if(isBounusAvailiable){
            userScore = userScore + 10;
        }
 //       if(isBounusAvailiable==false){
 //       }

        if (userScore>100 ||userScore<0) {
            System.out.println("Error");

        }
        else if(userScore>=60){
            System.out.println("Pass!");
        }
        else {
            System.out.println("Fail!");
        }
    }
}

