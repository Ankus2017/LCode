package ReverseString344;

public class ReverseString {

    //Challenge: Given a String, write code that returns the reversed String either with using the reverse method of StringBuilder - or without using the reverse method.
    /*
    Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
     */

    public static void main(String[] args){
        System.out.println(reverseStringFor("bla"));

        System.out.println(reverseStringByteArray("wojcik"));

        System.out.println(reverseStringBuilder("kleopatra"));

        System.out.println(reverseStringForStringBuilder("cesar"));
    }


    public static String reverseStringFor(String string){
        String reversedString = "";
        for(int i =0; i < string.length(); i++){
            char ch = string.charAt(i);
            reversedString = ch + reversedString;
        }

        return reversedString;
    }

    public static String reverseStringForStringBuilder(String string){
        StringBuilder stringBuilder = new StringBuilder();
        int stringSize = string.length() -1;
        for(int i = stringSize ; i >= 0; i--){
            char ch = string.charAt(i);
            stringBuilder.append(ch);
        }

        return stringBuilder.toString();
    }


    public static String reverseStringByteArray(String string){

        byte[] strByteArray = string.getBytes();

        int length = strByteArray.length;

        byte[] reverseByteArray = new byte[length];

        for(int i =0; i < length; i++){
            reverseByteArray[i] = strByteArray[length - i - 1];
        }
        return new String(reverseByteArray);
    }
    public static String reverseStringBuilder(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();

        return stringBuilder.toString();
    }
}
