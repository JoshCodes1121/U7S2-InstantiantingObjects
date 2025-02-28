package partA.ex02;

public class BballTeamPt1 {
    public static String BballTeam() {
        String response = "";
        
        if("Stephen" == "Michael"){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println();
        /**
         * Your code goes here
         */


        return response;
    }

    public static void main(String[] args) {
        String teamOutput = BballTeam();
        System.out.print(teamOutput);
    }
}
