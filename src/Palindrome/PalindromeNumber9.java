package Palindrome;

public class PalindromeNumber9 {

    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(121));

        System.out.println(isNumberPalindrome(1234));

        System.out.println(isNumberPalindrome(12321));
    }
    //COMEBACK7
    public static boolean isNumberPalindrome(int x){

        int myNumber = x;

        int newNumber = 0;
        if(x == 0){
            return true;
        }else if(x < 0 || x % 10 == 0){
            return false;
        }else{
            int numberOfDigits = 0;
            while (x != 0) {
                x = x / 10;
                ++numberOfDigits;
            }

            int stop = numberOfDigits -1;

            int half = (int)Math.ceil(numberOfDigits/2);

            for (int i = 0; i < half; i++) {

               int lastNumber = myNumber % 10;

               int divideBy = 10;
                for (int j = 1; j < stop; j++) {
                    divideBy *= 10;
                }

                System.out.println(" myNumber " + myNumber);
                System.out.println("divideBy " + divideBy);
               int firstNumber = myNumber / divideBy;

                System.out.println("lastnumber " + lastNumber);
                System.out.println("firstnumber " +firstNumber);
               if(!(lastNumber == firstNumber)){

                   return false;
               }

               --stop;

            }
        }
        return true;
    }
}
