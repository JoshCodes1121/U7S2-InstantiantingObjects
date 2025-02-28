package partA.ex01;

public class Player {
    public static String player() {
        String response = "\n"+"Player 1: \n" +
                "variable: Stephen Curry\n" +
                "Name: Stephen Curry\n" +
                "Height: 6'2\n" +
                "Years in the League: 13 years\n" +
                "\n" +
                "Player 2:\n" +
                "variable: Michael Jordan \n" +
                "Name: Michael Jordan\n" +
                "Height: 6'6\n" +
                "Years in the League: 15 years";


        /**
         * Your code goes here
         */


        String variable, height, name, years, player;

        player = "Player 1:";
        variable = "variable: Stephen Curry";
        name = "Name: Stephen Curry";
        height = "Height: 6'2";
        years = "Years in the league: 13 years";

        System.out.println(player + "\n"+ variable + "\n"+ name  + "\n" + height+ "\n"+ years);
        System.out.println("\n");

        player = "Player 2:";
        variable = "variable: Michael Jordan";
        name = "Name: Michael Jordan";
        height = "Height: 6'6";
        years = "Years in the league: 15 years";

        System.out.println(player + "\n"+ variable + "\n"+ name  + "\n" + height+ "\n"+ years);


        return response;
    }

    public static void main(String[] args) {
        String playerOutput = player();
        System.out.print(playerOutput);
    }
}
