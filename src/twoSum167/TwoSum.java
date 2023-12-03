package twoSum167;

import java.util.Arrays;

public class TwoSum {

    /*
    Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.


    2 <= numbers.length <= 3 * 10do4
    -1000 <= numbers[i] <= 1000
    numbers is sorted in non-decreasing order.
    -1000 <= target <= 1000
    The tests are generated such that there is exactly one solution.

     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, -1)));
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0,5,3}, 10)));
    }

    public static int[] twoSum(int[] numArray, int target){
        int a_pointer = 0;
        int b_pointer = numArray.length -1;

        while (a_pointer <= b_pointer){
            int sum = numArray[a_pointer] + numArray[b_pointer];
            if(sum == target){
                return new int[]{a_pointer+1, b_pointer+1};
            }else if(sum > target){
                b_pointer--;

            }else{
                a_pointer++;
            }

        }
        System.out.println("no pair found");
        return new int[]{};
    }

}
