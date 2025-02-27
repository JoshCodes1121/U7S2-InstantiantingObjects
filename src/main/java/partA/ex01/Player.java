package partA.ex01;

public class Player {
    public static String player() {
        String response = "";

        /**
         * Your code goes here
         */
        String variable, height, name, years;

        height = "6'2";
        variable = "welp";
        System.out.println(height+ " \n"+  variable);


        return response;
    }

    public static void main(String[] args) {
        String playerOutput = player();
        System.out.print(playerOutput);
    }
}
