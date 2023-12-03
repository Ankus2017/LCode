package BinarySearch704;

public class BinarySearch {

    /*
    Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
     */

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};

        int target = 9;

        System.out.println(searchA(nums, target));

        System.out.println(searchB(nums, target));
    }

    private static int searchB(int[] nums, int target) {

        int arrayLength = nums.length;

        if(arrayLength == 0) return -1;


        int left = 0;

        int right = arrayLength -1;

        while (left <= right){

            int midpoint = left + (right-left)/2;

            if(nums[midpoint] == target){
                return midpoint;
            }else if(nums[midpoint] > target){
                right = midpoint -1;
            }else{
                left = midpoint +1;
            }
        }

        return -1;

    }

    /*
    In this program, we have an example sorted array `arr` and a target value `target` that we want to search for using binary search.
    The `binarySearch` function is called, which in turn calls the `binarySearchRecursive` function.
    The `binarySearchRecursive` function performs the actual binary search using recursion.
     */
    private static int binarySearchR(int[] arr, int target) {
        return binarySearchRecursive(arr, target, 0, arr.length - 1);
    }

    /*
    The `binarySearchRecursive` function takes the array, target value, and the indices for the low and high boundaries of the search range.
    It compares the target value with the middle element of the current range. If they match, the function returns the index.
    If the target is smaller, it recursively calls itself with the left half of the range.
    If the target is larger, it recursively calls itself with the right half of the range.
    The process continues until the element is found or the low index becomes greater than the high index.
The program outputs the index where the element is found or a message indicating that the element was not found in the array.
Note: The program assumes that the array is sorted in ascending order.
     */
    private static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Element not found
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid; // Element found at mid index
        } else if (arr[mid] > target) {
            // Search in the left half
            return binarySearchRecursive(arr, target, low, mid - 1);
        } else {
            // Search in the right half
            return binarySearchRecursive(arr, target, mid + 1, high);
        }
    }



    private static int searchA(int[] nums, int target) {

        int arrayLength = nums.length;

        int midPoint = (int) Math.ceil(arrayLength/2);

        if(nums[midPoint] == target){
            return midPoint;
        }else if(nums[midPoint] > target){

            for (int i = 0; i < midPoint; i++) {
                if(nums[i] == target){
                    return i;
                }
            }
        }else if(nums[midPoint] < target){
            for (int i = arrayLength-1; i >midPoint ; i--) {
                if(nums[i] == target){
                    return i;
                }
            }
        }

        return -1;

    }
}
