package ReverseInteger7;

public class ReverseInteger {

    /*
    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).


     */
    public static void main(String[] args) {

        System.out.println(reverseInteger(54321));
    }

    public static Integer reverseInteger(Integer number){

        int reminder;
        int reversedInteger = 0;

       int newNumber = number;


        while(newNumber > 0){

            //get the last digit
            reminder = newNumber % 10;

            //reduce the old number
            newNumber /= 10;

            //create new number
            reversedInteger = (reversedInteger * 10) + reminder;

            if(reversedInteger > Integer.MAX_VALUE/10 || reversedInteger == Integer.MAX_VALUE/10 && reminder > 7) return 0;

            if(reversedInteger < Integer.MIN_VALUE/10 || reversedInteger == Integer.MIN_VALUE/100 && reminder < -8 ) return 0;

        }


        //System.out.println(reverseInteger);
        return reversedInteger;
    }
}
