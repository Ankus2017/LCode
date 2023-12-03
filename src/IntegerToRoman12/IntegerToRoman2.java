package IntegerToRoman12;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman2 {


    public static void main(String[] args) {

        System.out.println(intToRomanArray(3999));

        System.out.println(romanToInteger("MMMCMXCIX"));

        System.out.println(romanToInteger("MMDCLXXXIII"));

    }

    private static  final Integer maxRoman = 3999;

    private static  final Integer minRoman = 1;



    private static String intToRomanArray(int number) {

        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String[] tens = {"", "X", "XX", "XXX", "IL", "L", "LI", "LII", "LIII", "XC"};

        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

        String[] thousands = {"", "M", "MM", "MMM"};

        int th_index = number / 1000;
        System.out.println(th_index);
        String th = thousands[th_index];

        int h_index = (number % 1000) / 100;
        System.out.println(h_index);
        String h = hundreds[h_index];

        int t_index = (number % 100) / 10;
        System.out.println(t_index);
        String t = tens[t_index];

        int u_index = (number % 10);
        System.out.println(u_index);
        String u =  units[u_index];


        return th + h + t + u;
    }

    private static int romanToInteger(String romanNumber){

        Map<String, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put( "I", 1 );
        romanNumbers.put( "V", 5 );
        romanNumbers.put( "X", 10 );
        romanNumbers.put( "L", 50);
        romanNumbers.put( "C", 100);
        romanNumbers.put( "D", 500);
        romanNumbers.put( "M", 1000);

        int finalNumber = 0;

        int currentNumber;

        int nextNumber;

        int romanNumberLength = romanNumber.length();

        boolean lastLetter;


        for (int i = 0; i < romanNumberLength; i++) {

            char currentLetter = romanNumber.charAt(i);

            currentNumber = romanNumbers.get(String.valueOf(currentLetter));

            int nextIndex = i +1;

            if(nextIndex < romanNumberLength){
                lastLetter = false;

                char nextLetter = romanNumber.charAt(nextIndex);

                nextNumber =  romanNumbers.get(String.valueOf(nextLetter));
            }else{
                lastLetter = true;
                nextNumber = 0;
            }


            if(lastLetter || (currentNumber  >= nextNumber)){

                finalNumber+= currentNumber;

            }else{
                finalNumber += (nextNumber - currentNumber);
                i++;

            }

        }

        return finalNumber;
    }













}
