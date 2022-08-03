package homeWork6;


import lesson7.FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Game {
    public static void main(String[] args) {
        Game fileManager = new Game();
        fileManager.createFile("try15.txt");
        fileManager.writeToFile("try15.txt", "gameType","result");
    }
    public void createFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public void writeToFile(String fileName, String gameType, String result){
            try {
                FileWriter fileWriter = new FileWriter("try15.txt");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                FileWriter fileWriter = new FileWriter(fileName);
                fileWriter.write(Game.writeNumOfPlayersPerTeam(Game.gameType.SOCCER) + " " + Game.gameType.SOCCER + "  \n" + Game.writeNumOfPlayersPerTeam(Game.gameType.HOCKEY) + " " + Game.gameType.HOCKEY + " \n" + Game.writeNumOfPlayersPerTeam(Game.gameType.RUGBY) + " " + Game.gameType.RUGBY);
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error. cannot write... ");
                e.printStackTrace();
            }
        }


    public static int result;

    enum gameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static int writeNumOfPlayersPerTeam(gameType GameType) {
        try {

            switch (GameType) {
                case SOCCER:
                   result = 11;
                    break;

                case HOCKEY:
                   result = 6;
                    break;

                case RUGBY:
                  result = 15;
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}



