package DetectCapital520;

import java.util.function.Predicate;

public class detectCapital {
    /*
    We define the usage of capitals in a word to be right when one of the following cases holds:

    All letters in this word are capitals, like "USA".
    All letters in this word are not capitals, like "leetcode".
    Only the first letter in this word is capital, like "Google".

Given a string word, return true if the usage of capitals in it is right.
     */

    public static void main(String[] args){

        isUsageOfCapitalRight("USA");
        isUsageOfCapitalRight("Poland");
        isUsageOfCapitalRight("java");

        isUsageOfCapitalRight("jAva");
    }

    private static boolean isUsageOfCapitalRight(String string){
        int stringLength = string.length();

        if(stringLength < 2){
            System.out.println("Right usage of capital : " + string);
            return true;
        }
        Predicate<Character> wrongCase = Character::isLowerCase;
        char firstChar = string.charAt(0);
        char secondChar = string.charAt(1);
        int startIndex;
        if(Character.isUpperCase(firstChar) && Character.isUpperCase(secondChar)){
             startIndex = 2;

        }else{
            startIndex = 1;
            wrongCase = Character::isUpperCase;

        }

        for (int i = startIndex; i < stringLength; i++) {
            if(wrongCase.test(string.charAt(i))){
                System.out.println("Wrong usage of capital : " + string);
                return false;
            }
        }
        System.out.println("Right usage of capital : " + string);
        return true;


    }
}
