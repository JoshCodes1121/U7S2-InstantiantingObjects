package partA.ex02;

import partA.ex01.Player;

public class BballTeamPt1 {
    public static String BballTeam() {
        String response = "";
        /**
         * Your code goes here
         */

//        String Michael = Player.player();
//        System.out.println(Michael);

        Player Stephen  = new Player();
        Stephen.playerNum = "Player 1: ";
        Stephen.variable = "variable: Stephen Curry";
        Stephen.name = "Name: Stephen Curry";
        Stephen.height = "Height: 6'2";
        Stephen.yearsInLeague = "Years in the League: 13 years";

        Player Michael = new Player();
        Michael.playerNum = "Player 2:";
        Michael.variable = "variable: Michael Jordan ";
        Michael.name = "Name: Michael Jordan";
        Michael.height = "Height: 6'6";
        Michael.yearsInLeague = "Years in the League: 15 years";

        if (Stephen == Michael){
            System.out.println("true");
        } else if (Stephen != Michael) {
            System.out.println("false");
        }else {
            System.out.println("ERROR!!");
        }
        boolean equatesTo = Stephen == Michael;
        System.out.println(equatesTo);
        Stephen = Michael;
        boolean valueNow = Stephen == Michael;
        System.out.println(valueNow);
        if (Stephen == Michael){
            System.out.println("true");
        } else if (Stephen != Michael) {
            System.out.println("false");
        }else {
            System.out.println("ERROR!!");
        }
        return response;
    }


    public static void main(String[] args) {
        String teamOutput = BballTeam();
        System.out.print(teamOutput);
    }
}
