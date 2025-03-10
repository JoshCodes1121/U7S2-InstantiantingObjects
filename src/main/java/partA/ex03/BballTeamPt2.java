package partA.ex03;

import partA.ex01.Player;

import java.util.Scanner;

public class BballTeamPt2 {
    public static String BballTeam() {
        String response = "";

        /**
         * Your code goes here
         */
        Player Nicky = new Player();
        Nicky.playerNum = "Player 1: ";
        Nicky.variable = "variable: Stephen Curry";
        Nicky.name = "Name: Stephen Curry";
        Nicky.height = "Height: 6'2";
        Nicky.yearsInLeague = "Years in the League: 13 years";

        Player Todd = new Player("playyer 2", var,);
        Todd.playerNum = "Player 2:";
        Todd.variable = "variable: Michael Jordan ";
        Todd.name = "Name: Michael Jordan";
        Todd.height = "Height: 6'6";
        Todd.yearsInLeague = "Years in the League: 15 years";

//        System.out.println(Nicky == Todd ? true:false);// IF STATMENT!! Checks if the vairable nicky, is equal to todd, if so print true, else print false
//        Todd = Nicky;
//        System.out.println( Nicky == Todd ? true:false );

        System.out.println(Todd);
        return response;
    }

    public static void main(String[] args) {
        String teamOutput = BballTeam();
        System.out.print(teamOutput);
    }
}
