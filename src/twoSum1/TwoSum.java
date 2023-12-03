package twoSum1;

import java.util.*;

public class TwoSum {
    /*
    Given an array and an expected sum, you are required to find the index of the two numbers in the array whose sum adds up to the number
     */
    //T
    public static void main(String[] args){

        int sum = 8;

        int[] intArray = new int[]{2,7,11,15, 10, -3, 1, 6, 7, 0, 4, 4, 4, 4};

       //twoSumArrayToList(intArray, sum);

        twoSumArrayToListDuplicates(intArray, sum);

        //System.out.println(Arrays.toString(twoSumArrayToMap(intArray, sum)));

        // twoSumFor(intArray,sum);
        // twoSumArrayListFor(intList, sum);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(7);
        intList.add(11);
        intList.add(3);
        intList.add(4);
        intList.add(10);
        intList.add(-3);

       // twoSumArrayList(intList, sum);

      //  twoSumArrayToMap(intArray, sum);
    }

    private static void twoSumArrayToListDuplicates(int[] intArray, int sum) {
        ArrayList<int[]> pairList = new ArrayList<>();

        ArrayList<Integer> intList = new ArrayList<>();

        for(int i =0; i < intArray.length; i++){
            int currentNumber =  intArray[i];
            int currentIndex = i;

            int secondNumber = sum - currentNumber;
            if(intList.contains(secondNumber)){
                int secondIndex = intList.indexOf(secondNumber);
                int[] foundPair = new int[]{currentIndex, secondIndex};
                pairList.add(foundPair);
            }
            intList.add(currentIndex, currentNumber);

        }

/*
        List<Integer> checkedListIndexes = new ArrayList<>();

        //checked hashMap
        Map<Integer, Integer> checkedMap = new HashMap<>();

        for(int i =0; i < intList.size(); i++){

            int currentNumber = intList.get(i);
            //  System.out.println(i +" -> " + currentNumber);


            int secondNumber = sum - currentNumber;
            int firstIndex = i;
            int secondIndex = intList.indexOf(secondNumber);
            // checkedList
            if(intList.contains(secondNumber) && !checkedListIndexes.contains(secondIndex) ){

                checkedListIndexes.add(firstIndex);
                checkedListIndexes.add(secondIndex);
                //  System.out.println("secondNumber " +secondNumber);


                //System.out.println("secondNumber " +secondIndex);

                if (firstIndex != secondIndex) {
                    int[] foundPair = new int[]{firstIndex, secondIndex};
                    pairList.add(foundPair);
                }
            }


        }


 */
        for( int[] pair :pairList){
            System.out.println(Arrays.toString(pair));
        }
    }

    private static void twoSumArrayToList(int[] intArray, int sum) {
        List<int[]> pairList = new ArrayList<>();

        ArrayList<Integer> intList = new ArrayList<>();
        for(int i =0; i < intArray.length; i++){

            intList.add(i, intArray[i]);
        }


        List<Integer> checkedListIndexes = new ArrayList<>();

        //checked hashMap
        Map<Integer, Integer> checkedMap = new HashMap<>();

        for(int i =0; i < intList.size(); i++){

            int currentNumber = intList.get(i);
          //  System.out.println(i +" -> " + currentNumber);


            int secondNumber = sum - currentNumber;
            int firstIndex = i;
            int secondIndex = intList.indexOf(secondNumber);
            // checkedList
             if(intList.contains(secondNumber) && !checkedListIndexes.contains(secondIndex) ){

                 checkedListIndexes.add(firstIndex);
                 checkedListIndexes.add(secondIndex);
                    //  System.out.println("secondNumber " +secondNumber);


                    //System.out.println("secondNumber " +secondIndex);

                    if (firstIndex != secondIndex) {
                        int[] foundPair = new int[]{firstIndex, secondIndex};
                        pairList.add(foundPair);
                    }
                }


        }

        for( int[] pair :pairList){
            System.out.println(Arrays.toString(pair));
        }
    }

    private static int[] twoSumArrayToMap(int[] intArray, int sum) {

        Map<Integer, Integer> intMap = new HashMap<>();

        for(int i =0; i < intArray.length; i++){
            int currentNumber = intArray[i];
            int secondNumber = sum - currentNumber;

            if(intMap.containsKey(secondNumber)){
                System.out.println(Arrays.toString( new int[] { i, intMap.get(secondNumber)}));
                return new int[] { i, intMap.get(secondNumber)};
            }
            intMap.put(currentNumber, i);
        }

        return null;

        /*
        for(Map.Entry<Integer, Integer> entry : intMap.entrySet()){
            int currentNumber = entry.getValue();
            int secondNumber = sum - currentNumber;

            if(intMap.containsValue(secondNumber)){
                //int secondIndex = intMap.
               // int[] foundPairIndexes = new int[]{entry.getKey(), secondIndex};
                //pairList.add(int)
            }
        }

         */



    }

    public static void twoSumArrayList(ArrayList<Integer> intList, int sum){
        List<int[]> pairList = new ArrayList<>();
        for(int i =0; i < intList.size(); i++){

            int currentNumber = intList.get(i);
            //System.out.println(i +" -> " + currentNumber);

               int secondNumber = sum - currentNumber;
               if(intList.contains(secondNumber)){
                  int secondIndex = intList.indexOf(secondNumber);
                  int firstIndex = i;
                   int[] foundPair = new int[]{firstIndex, secondIndex};
                   pairList.add(foundPair);
                   intList.remove(secondIndex);
               }

        }

       for( int[] pair :pairList){
           System.out.println(Arrays.toString(pair));
       }

    }

    /*
   second attempt - double for no duplicates
    */
    public static void twoSumArrayListFor(List<Integer> intList, int sum){
        List<int[]> pairList = new ArrayList<>();
        List<Integer> checked = new ArrayList<>();

        for(int i =0; i < intList.size(); i++){
            for(int j = i+1; j <intList.size(); j++){
               // System.out.println("checked array");
               // System.out.println(checked);
                if(!checked.contains(i)){

                    //System.out.println("checked does not contain" + i);
                    //System.out.println("wiec dodajemy " + i +" "+ j);

                    if(intList.get(i) + intList.get(j) == sum){
                        int[] foundPair = new int[]{i, j};
                        pairList.add(foundPair);
                        System.out.println("found pair");

                        System.out.println(Arrays.toString(foundPair));
                    }
                }

            }
            checked.add(i);

        }

    }

    /*
    first attempt - double for duplictaes
     */
    public static void twoSum(int[] intArray, int sum){

        List<int[]> list = new ArrayList<>();
       for(int i =0; i < intArray.length; i++){
           for(int j =0; j <intArray.length; j++){
               if(intArray[i] + intArray[j] == sum){
                   int[] foundPair = new int[]{i, j};
                   list.add(foundPair);
                   System.out.println(Arrays.toString(foundPair));
               }
           }

       }

    }
}
