package homeWork6;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        int result = Game.writeNumOfPlayersPerTeam(Game.gameType.SOCCER);
        System.out.println("Soccer's: " + result);
        result = Game.writeNumOfPlayersPerTeam(Game.gameType.HOCKEY);
        System.out.println("Hockey's: " + result);
        result = Game.writeNumOfPlayersPerTeam(Game.gameType.RUGBY);
        System.out.println("Rugby's: " + result);
    }
}

