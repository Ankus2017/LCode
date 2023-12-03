package HashSet705;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet2 {

    /*
    Design a HashSet without using any built-in hash table libraries.

    Implement MyHashSet class:

    void add(key) Inserts the value key into the HashSet.
    bool contains(key) Returns whether the value key exists in the HashSet or not.
    void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.


     */
    private final int MAX = 1000000;

    private final int SIZE = 1000;

    List<List<Integer>> parentList;

    //COMEBACK1
    public MyHashSet2(){

        parentList = new ArrayList<>(SIZE);

        for (int i = 0; i < 1000; i++) {
           List<Integer> childlist = new LinkedList<>();
           parentList.add(i, childlist);

        }


    }

    private void add(int number){


        int index = number % SIZE;

        List<Integer> childlist = parentList.get(index);

        if(childlist.isEmpty()){
            List<Integer> list = new LinkedList<>();
            list.add(number);
            parentList.set(index, list);

        }else{
            if(!childlist.contains(number)) {

                childlist.add(number);
            }
        }



    }

    private boolean contains(int number){

        int index = number % SIZE;

        List<Integer> childlist = parentList.get(index);

        if(childlist.contains(number)){
            return true;
        }else{
            return false;
        }
    }

    private void remove(int number){
        int index = number % SIZE;

        List<Integer> childlist = parentList.get(index);

        if(childlist.contains(number)){

            childlist.remove(Integer.valueOf(number));
        }

    }

    public void traverse(MyHashSet2 myNewSet){

        for (int i = 0; i < myNewSet.parentList.size(); i++) {
            List<Integer> childlist = myNewSet.parentList.get(i);
            if(!childlist.isEmpty()){
                for (Integer child : childlist) {
                    System.out.println(child);
                }
            }
        }
    }

    public static void main(String[] args){

        MyHashSet2 myNewSet = new MyHashSet2();

        myNewSet.add(15);

        myNewSet.add(30);

        myNewSet.traverse(myNewSet);
        myNewSet.remove(15);

        System.out.println(myNewSet.contains(30));

        System.out.println(myNewSet.contains(15));


        myNewSet.traverse(myNewSet);


    }

}
