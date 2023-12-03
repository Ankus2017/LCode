package IntegerToRoman12;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {


    public static void main(String[] args) {

          intToRomanMap(3999);

        // intToRomanArray(2674);

        //romanToInteger2("MMDCLXXIV");

       // romanToInteger1("MMDCLXXIV");

        // romanToInteger1("MMMCMXCIX");

        romanToIntegerMap("MMMCMXCIX");

    }


    private static int romanToIntegerMap(String romanNumber){

        Map<String, Integer> romans = new HashMap<>();
        romans.put( "I", 1 );
        romans.put( "V", 5 );
        romans.put( "X", 10 );
        romans.put( "L", 50);
        romans.put( "C", 100);
        romans.put( "D", 500);
        romans.put( "M", 1000);


        int finalNumber = 0;

        int currentNumber = 0;

        //MMDCLXXIV
        int strLength = romanNumber.length();

        for(int i =0; i < strLength; i++) {
            int nextNumber = 0;
            char ch = romanNumber.charAt(i);
            int toAdd = 0;

            //MMDCLXXIV
            currentNumber = romans.get(Character.toString(ch));

            int index = i;
            int indexNextNumber = ++index;

            if(indexNextNumber < strLength){
                nextNumber = romans.get(Character.toString(romanNumber.charAt(indexNextNumber)));
            }

            //MMDCLXXIV
            if(currentNumber >= nextNumber){
                System.out.println("addition " + currentNumber );
                toAdd = currentNumber;

            }else{

                System.out.println("substraction " + nextNumber + " - " +  currentNumber);
                toAdd = nextNumber - currentNumber;
                i++;
            }

            finalNumber += toAdd;

        }

        System.out.println(finalNumber);
        return finalNumber;
    }

    private static int romanToInteger1(String romanNumber){

        int finalNumber = 0;

        int currentNumber = 0;

        //MMDCLXXIV
        int strLength = romanNumber.length();

        for(int i =0; i < strLength; i++) {
            int nextNumber = 0;
            char ch = romanNumber.charAt(i);
            int toAdd = 0;

            //MMDCLXXIV
            currentNumber = romanToIntSwitch(ch);

            int index = i;
            int indexNextNumber = ++index;

            if(indexNextNumber < strLength){
                nextNumber = romanToIntSwitch(romanNumber.charAt(i + 1));
            }

            //MMDCLXXIV
            if(currentNumber >= nextNumber){
                System.out.println("addition " + currentNumber );
                toAdd = currentNumber;

            }else{

                System.out.println("substraction " + nextNumber + " - " +  currentNumber);
                toAdd = nextNumber - currentNumber;
                i++;
            }

            finalNumber += toAdd;

        }

        System.out.println(finalNumber);
        return finalNumber;
    }

    private static int romanToIntSwitch(char roman){
        int currentNumber = 0;
        switch (roman){
            case 'M' : currentNumber = 1000;
                break;
            case 'D' : currentNumber = 500;
                break;
            case 'C' : currentNumber = 100;
                break;
            case 'L' : currentNumber = 50;
                break;
            case 'X' : currentNumber = 10;
                break;
            case 'V' : currentNumber = 5;
                break;
            case 'I' : currentNumber = 1;
                break;

        }

        return currentNumber;

    }

    private static int romanToInteger2(String romanNumber){

        int finalNumber = 0;

        int previousNumber = 0;

        int currentNumber = 0;

        int size = romanNumber.length() - 1;

        for(int i =size; i >= 0; i--) {
            char ch = romanNumber.charAt(i);
            int toAdd = 0;

            currentNumber = romanToIntSwitch(ch);

            int previousIndex = --i;


            if(previousIndex >= 0 && currentNumber < previousNumber){

                char previousRoman =  romanNumber.charAt(--i);

                previousNumber = romanToIntSwitch(previousRoman);

                System.out.println("substraction " + previousNumber + " - " + currentNumber );
                toAdd = previousNumber - currentNumber;
            }else{
                System.out.println("addition " + currentNumber );
                toAdd = currentNumber;
            }

            finalNumber += toAdd;

        }

        System.out.println(finalNumber);
        return finalNumber;
    }

    private static String intToRomanArray(int number) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds =
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens =
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units =
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String result = thousands[number / 1000] +
                hundreds[(number % 1000) / 100] +
                tens[(number % 100) / 10] +
                units[number % 10];

        System.out.println(result);
        return result;
    }


    private static  final Integer maxRoman = 5000;

    private static  final Integer minRoman = 0;

    private static String intToRomanMap(int number){


       if(number < minRoman || number > maxRoman){
           return "Number out of range";
       }
       Map<Integer, String> units = initialiseUnits();

       Map<Integer, String> tens = initialiseTens();

       Map<Integer, String> hundreds = initialiseHundreds();

       Map<Integer, String> thousands = initialiseThousands();

       int reminder;

       String roman = "";

       int numberLength = 0;


       int newNumber = number;


       while(newNumber > 0 || numberLength  == 4){
           numberLength++;
           System.out.println(numberLength);

           String romanNumber ="";
           reminder = newNumber % 10;
           System.out.println(reminder);

           switch (numberLength) {
               case 1 :  romanNumber = units.getOrDefault(reminder, "");
                    break;
               case 2 :  romanNumber = tens.getOrDefault(reminder*10, "");
                    break;
               case 3 :  romanNumber = hundreds.getOrDefault(reminder*100, "");
                   break;
               case 4 :  romanNumber = thousands.getOrDefault(reminder*1000, "");
                   break;
           }

           System.out.println(romanNumber);
            roman =  romanNumber + roman;
               System.out.println(roman);

           newNumber /= 10;

       }

        return roman;
   }

    private  static Map<Integer, String> initialiseUnits() {
        Map<Integer, String> units = new HashMap<>();
        units.put(1, "I");
        units.put(2, "II");
        units.put(3, "III");
        units.put(4, "IV");
        units.put(5, "V");
        units.put(6, "VI");
        units.put(7, "VII");
        units.put(8, "VIII");
        units.put(9, "IX");
        return units;


    }

    private  static Map<Integer, String> initialiseTens(){
        Map<Integer, String> tens = new HashMap<>();
        tens.put(10, "X");
        tens.put(20, "XX");
        tens.put(30, "XXX");
        tens.put(40, "XL");
        tens.put(50, "L");
        tens.put(60, "LX");
        tens.put(70, "LXX");
        tens.put(80, "LXXX");
        tens.put(90, "XC");

        return tens;
    }

    private  static Map<Integer, String> initialiseHundreds(){
        Map<Integer, String> hundreds = new HashMap<>();
        hundreds.put(100, "C");
        hundreds.put(200, "CC");
        hundreds.put(300, "CCC");
        hundreds.put(400, "CD");
        hundreds.put(500, "D");
        hundreds.put(600, "DC");
        hundreds.put(700, "DCC");
        hundreds.put(800, "DCCC");
        hundreds.put(900, "CM");

        return hundreds;
    }

    private  static Map<Integer, String> initialiseThousands(){
        Map<Integer, String> thousands = new HashMap<>();
        thousands.put(1000, "M");
        thousands.put(2000, "MM");
        thousands.put(3000, "MMM");
        thousands.put(4000, "I̅V̅");
        thousands.put(5000,"V̅");
        // thousands.put(10000,"X̅");

        return thousands;
    }



}
