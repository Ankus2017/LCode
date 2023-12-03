package DetectCapital520;

import java.util.function.Predicate;

public class detectCapital2 {
    /*
    We define the usage of capitals in a word to be right when one of the following cases holds:

    All letters in this word are capitals, like "USA".
    All letters in this word are not capitals, like "leetcode".
    Only the first letter in this word is capital, like "Google".

Given a string word, return true if the usage of capitals in it is right.
     */

    public static void main(String[] args){

        System.out.println(isUsageOfCapitalRight("USA"));
        System.out.println(isUsageOfCapitalRight("Poland"));
        System.out.println(isUsageOfCapitalRight("java"));
        System.out.println(isUsageOfCapitalRight("jAva"));
    }

    private static boolean isUsageOfCapitalRight(String string){
        int stringLength = string.length();

        if(stringLength < 2){
            System.out.println("Right usage of capital : " + string);
            return true;
        }

        int startIndex;
        Predicate<Character> wrongCase = Character::isLowerCase;
        if(Character.isUpperCase(string.charAt(0)) && Character.isUpperCase(string.charAt(1))){
            startIndex = 2;

        }else{
            startIndex = 1;
            wrongCase = Character::isUpperCase;
        }

        for (int i = startIndex; i < string.length()-1; i++) {

            boolean wrongUsage = wrongCase.test(string.charAt(i));
            if(wrongUsage){
                return false;
            }
        }

        return true;
    }
}
