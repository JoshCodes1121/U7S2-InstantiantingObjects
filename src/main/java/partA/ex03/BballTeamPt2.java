package partA.ex03;

import partA.ex01.Player;


public class BballTeamPt2 {
    public static String BballTeam() {
        String response = "";

        /**
         * Your code goes here
         */
//        Player Nicky = new Player("Player 1: ","variable: Stephen Curry",
//                "Name: Stephen Curry", "Height: 6'2", "Years in the League: 13 years" );
//
//        Player Todd = new Player("Player 2:","variable: Michael Jordan ",
//                "Name: Michael Jordan","Height: 6'6","Years in the League: 15 years");

        Player Nicky = new Player();
        Nicky.playerNum = "Player 1: ";
        Nicky.variable = "variable: Stephen Curry";
        Nicky.name = "Name: Stephen Curry";
        Nicky.height = "Height: 6'2";
        Nicky.yearsInLeague = "Years in the League: 13 years";

        Player Todd = new Player();
        Todd.playerNum = "Player 2:";
        Todd.variable = "variable: Michael Jordan ";
        Todd.name = "Name: Michael Jordan";
        Todd.height = "Height: 6'6";
        Todd.yearsInLeague = "Years in the League: 15 years";




//        System.out.println(Nicky == Todd ? true:false);// IF STATMENT!! Checks if the vairable nicky, is equal to todd, if so print true, else print false
//        Todd = Nicky;
//        System.out.println( Nicky == Todd ? true:false );
//
//       boolean isItTrue = Nicky == Todd;
//        System.out.println(isItTrue);


        response = String.valueOf(Nicky  == Todd);// String.valueOf turns the value of whatever in the arenthesis into
        return response;
    }

    public static void main(String[] args) {
        String teamOutput = BballTeam();
        System.out.print(teamOutput);
    }
}
