package Palindrome;

public class StringPalindrome125_2 {

    //COMEBACK6
    public static void main(String[] args){
        System.out.println(isPalindromeStringBuilder("madam"));

        System.out.println(isPalindromeLoop("kayak"));

        System.out.println(isPalindromeLoop("racecar"));

        System.out.println(palindromeLongestSubstring("gdkayakkj"));

        System.out.println(palindromeLongestSubstring("poxdracecarlmop"));

    }

    private static String palindromeLongestSubstring(String string) {

        int stringLength = string.length();

        boolean pair =  (stringLength % 2 == 0) ? true : false;

        int index1;

        int index2;

        int midpoint = (int) Math.ceil(stringLength /2);
        System.out.println(midpoint);
        char midLetter = string.charAt(midpoint);
        System.out.println(midLetter);

                String longestPalindrome = "";

        boolean isPalindrome = false;

        if(pair){
            index1 = (stringLength /2) - 1;
            index2 = (stringLength /2);
        }else{

            index1 = midpoint -1;
            index2 = midpoint +1;
        }

        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < midpoint; i++) {
            if(string.charAt(index1) == string.charAt(index2)){
                isPalindrome = true;
                firstIndex = index1;
                secondIndex = index2;
                ++index1;
                --index2;
            }else{
                break;
            }
        }

        if(isPalindrome){
            firstIndex++;
            longestPalindrome = string.substring(secondIndex, firstIndex);
        }



       return longestPalindrome;

    }

    private static Boolean isPalindromeStringBuilder(String string){

        StringBuilder sb = new StringBuilder(string);

        String reversed = sb.reverse().toString();

        if(reversed.equals(string)){
            return true;
        }else{
            return false;
        }

    }

    private static Boolean isPalindromeLoop(String string){

        int stringLength = string.length();
        int lastIndex = stringLength -1;

        for (int i = 0; i < stringLength; i++) {

            if(!(string.charAt(i) == string.charAt(--stringLength))){
                return false;
            }

        }

        return true;

    }
}
