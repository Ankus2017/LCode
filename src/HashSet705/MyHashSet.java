package HashSet705;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {

    /*
    Design a HashSet without using any built-in hash table libraries.

    Implement MyHashSet class:

    void add(key) Inserts the value key into the HashSet.
    bool contains(key) Returns whether the value key exists in the HashSet or not.
    void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.


     */
    private final int MAX = 1000000;

    private final int SIZE = 1000;

    private List<List<Integer>> parentList;

    public MyHashSet(){
        parentList = new ArrayList<>(SIZE);
        System.out.println(10 % 1000);
    }

    private void add(int number){

        int index = number % SIZE;

        List<Integer> childList = parentList.get(index);
        if(childList.isEmpty()){
            List<Integer> list = new LinkedList<>();
            list.add(number);
            parentList.set(index, list);
        }else{

            if(!childList.contains(number)) {

                childList.add(number);
            }

        }


    }
    private boolean contains(int number){

        int index = number % SIZE;
        List<Integer> childList = parentList.get(index);

        return  childList.contains(number);

    }

    private void remove(int number){

        int index = number % SIZE;
        List<Integer> childList = parentList.get(index);

        if(childList.contains(number)) {

            childList.remove(Integer.valueOf(number));
        }
    }

    public static void main(String[] args){
        System.out.println(new MyHashSet());
    }

}
