package ContainsDuplicate217;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate2 {

    /*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     */

    public static boolean containsDuplicate(int[] array){
        int arrayLength = array.length;
        int lastIndex = arrayLength -1;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = i+1; j <= lastIndex; j++) {
                if(array[i] == array[j]){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean containsDuplicateHashSet(int[] array){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if(set.contains(array[i])){
                return true;
            }else{
                set.add(array[i]);
            }

        }

        return false;

    }

    public static boolean containsDuplicateSort(int[] array){
        Arrays.sort(array);


        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == array[i+1]){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){

        int[] array1 = {1,2,3,4,5};

        System.out.println(containsDuplicate(array1));

        System.out.println(containsDuplicateHashSet(array1));

        System.out.println(containsDuplicateSort(array1));

        int[] array2 = {1,2,3,4,5,5};

        System.out.println(containsDuplicate(array2));

        System.out.println(containsDuplicateHashSet(array2));

        System.out.println(containsDuplicateSort(array2));

    }
}
