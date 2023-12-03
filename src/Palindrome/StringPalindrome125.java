package Palindrome;

public class StringPalindrome125 {

    //COMEBACK6
    public static void main(String[] args){
        isPalindromeStringBuilder("madam");

        isPalindromeLoop("kayak");

        isPalindromeSubstring("love");

        isPalindromeSubstring("gdkayakkj");

    }

    private static String isPalindromeSubstring(String string) {


        int stringLength = string.length();
        if(stringLength < 2){
            return string;
        }
        String palindrome ="";

        int maxLoopRounds =  (int)Math.floor((stringLength / 2));
        int indexOne;
        int indexTwo;

        if(stringLength % 2 == 0){
            indexOne = (stringLength / 2) -1;
            indexTwo = (stringLength / 2);

        }else{
            int midPoint = (int)Math.ceil(stringLength / 2);
            palindrome = String.valueOf(string.charAt(midPoint));
            indexOne = midPoint-1;
            indexTwo = midPoint+1;

        }

       while (maxLoopRounds > 0){
           char firstChar = string.charAt( indexOne);
           char secondChar = string.charAt( indexTwo);
           if(firstChar == secondChar){
                palindrome = firstChar + palindrome;
                palindrome = palindrome + secondChar;
           }else{
               break;
           }
           --indexOne;
           ++indexTwo;
           maxLoopRounds--;
       }

       if(palindrome.isEmpty()){
           System.out.println("No palindrome found");
       }else{
           System.out.println("Palindrome found : " + palindrome + ". Length of longest substring palindrome : " + palindrome.length());
       }


       return palindrome;

    }

    private static Boolean isPalindromeStringBuilder(String string){
        String reversed;

        StringBuilder sb = new StringBuilder(string);
        reversed = sb.reverse().toString();

        if(string.equals(reversed)){
            System.out.println("This string is a palindrome " + string + " -> " + reversed);
            return true;
        }
        System.out.println("This string is not a palindrome " + string + " -> " + reversed);
        return false;

    }

    private static Boolean isPalindromeLoop(String string){
        int stringLength = string.length();
        for (int i = 0; i < stringLength; i++) {
            int secondCharIndex = --stringLength;
            char char1 = string.charAt(i);
            char char2 = string.charAt(secondCharIndex);

            if(char1 != char2){
                System.out.println("This string is not a palindrome " + string );
                return false;
            }
        }
        System.out.println("This string is  a palindrome " + string);
        return true;
    }
}
