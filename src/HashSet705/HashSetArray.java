package HashSet705;

public class HashSetArray {

    /*
    Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

    void add(key) Inserts the value key into the HashSet.
    bool contains(key) Returns whether the value key exists in the HashSet or not.
    void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.

    //boolean array of size 10000001
    add arr[n] = true
    remove arr[n] = false
    contains arr[n]
     */

    boolean[] arr;
    public HashSetArray(){
        arr = new boolean[1000001];
    }

    private void add(int number){

        arr[number] = true;

    }
    private boolean contains(int number){
        return   arr[number];

    }

    private void remove(int number){

        arr[number] = false;    }
}
