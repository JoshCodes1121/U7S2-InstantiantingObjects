package partC;

public class AlgoChallenge {
     /* Problem 20
       We are looking for numbers within two different ranges. You will be provided two numbers
       and need to see if they are both in the range of 30...40 inclusive or 40...50 inclusive.
       The numbers were looking for have to be within either one of those ranges.

       Return true if both numbers are in the range 30...40, or both numbers are in the range 40...50.

       Example:
       range3050(30, 31) --> true
       range3050(30, 41) --> false
       range3050(40, 50) --> true
     */
    public static Boolean range3050(int one, int two) {
        if (one >=30 && one <= 40) {
            if (two >=30 && two <= 40) {
                return true;
            }

        } if (one >=40 && one <= 50) {
            if (two >=40 && two <= 50) {
                return true;
            }

        }if(one >=30 && one <= 40 ){
            if (two >=40 && two <= 50){
                return false;
            }
        }if(one >=40 && one <= 50){
            if (two >=30 && two <= 40){
                return false;
            }
        }
            else {
            return false;
        }
        return range3050(one,two);
    }

     /* Problem 21
       We're on the lookout for values that contain the same last digit.
       You will be given two non-negative numbers to compare.
       Tip: Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
       Return true if both digits have the same last digit.
       Example:
       compareLastDigit(7, 17) --> true
       compareLastDigit(6, 17) --> false
       compareLastDigit(3, 113) --> true
     */

    public static Boolean compareLastDigit(int value1, int value2) {
        if (value1 % 10 == value2 % 10) {
            return true;
        } else {
            return false;
        }
    }


}
