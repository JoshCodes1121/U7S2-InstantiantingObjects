package partA.ex02;

import partA.ex01.Player;

public class BballTeamPt1 {
    public static String BballTeam() {
        String response = "";
        Player  camel = new Player();
        Player  cameltoe = new Player();
        cameltoe.variable= "Flower glim and glow let your power shine" +
                " make the clock reverise bring back what once was mine";
        cameltoe.name = "heal what has been hurt, change the fate's design, save what has been lost";
        cameltoe.yearsInLeague = "bring back what once was mine, what onceee wasssss mineeee";

        if( camel== cameltoe){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(cameltoe);
        /**
         * Your code goes here
         */
        boolean equals = true;
        System.out.println("Stephen equates to Michael?: " + equals);
        return response;
    }

    public static void main(String[] args) {
        String teamOutput = BballTeam();
        System.out.print(teamOutput);
    }
}
