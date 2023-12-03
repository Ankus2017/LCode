package ContainsDuplicate217;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

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
          if(set.contains(array[i])) return true;
          set.add(array[i]);
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

        int[] array1 = {1,2,2,4};

    }
}
