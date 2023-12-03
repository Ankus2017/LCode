package PascalTriangle118;

import javax.swing.event.ChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    /*
    Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
     */

    public PascalTriangle(int numRows) throws Exception {

        generate(numRows);
    }

    private List<List<Integer>> parentList;


    private List<List<Integer>> generate(int numRows) throws Exception {

        if(numRows > 30 || numRows < 1){
            throw new Exception(numRows +" id out of range from 1 - 30" );
        }

        parentList = new ArrayList<>(numRows);
        List<Integer> previousChildlist = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            int rowNumber = i;

            List<Integer> childlist;
            ++rowNumber;

            System.out.println("createRow " + rowNumber + " " + previousChildlist);
           // childlist =  createRow(rowNumber, previousChildlist);

            childlist =  createRow(rowNumber, previousChildlist);

           System.out.println(childlist);

            parentList.add(i, childlist);

           previousChildlist = childlist;

        }
        return parentList;
    }

    private List<Integer> createRow(int rowNumber, List<Integer> previousChildlist) {

        int sizePreviousChild = previousChildlist.size();

        List<Integer> childList = new ArrayList<>(rowNumber);

        boolean add1 = sizePreviousChild <= 1;

        int value;

        childList.add(0,1);
        boolean oddRowNumber = (rowNumber % 2 != 0);
        System.out.println("oddrownumber " + oddRowNumber);

        int lastIndex = rowNumber-1;
        int secondNumber = lastIndex -1;

        if(rowNumber > 2){
            System.out.println("rowNumber > 2");
            double halfD = rowNumber / 2;

            int half = (int) Math.ceil(halfD);

            System.out.println("half " + half);
            for (int i = 1; i < half; i++) {

                // System.out.println(previousChildlist);
                //System.out.println(oddRowNumber);
                value = previousChildlist.get(i-1) + previousChildlist.get(i);

                System.out.println("first add value" + value +" at" + i );
                childList.add(i, value);
                System.out.println(childList);


                //value = previousChildlist.get(i-1) + previousChildlist.get(i);
                System.out.println("second add value" + value +" at" + i );
                childList.add(i, value);
                System.out.println(childList);


            }
            if(oddRowNumber){
                value = previousChildlist.get(half-1) + previousChildlist.get(half);
                childList.add(half, value);
            }
        }

        if(rowNumber > 1){

            childList.add(lastIndex, 1);

        }


        return childList;
    }

    private List<Integer> createRow3(int rowNumber, List<Integer> previousChildlist) {

        int sizePreviousChild = previousChildlist.size();

        List<Integer> childList = new ArrayList<>(rowNumber);

        boolean add1 = sizePreviousChild <= 1;

        int value;

        childList.add(0,1);
        boolean oddRowNumber = (rowNumber % 2 != 0);
        System.out.println("oddrownumber " + oddRowNumber);

        int lastIndex = rowNumber-1;
        int secondNumber = lastIndex;

        if(rowNumber > 2){
            System.out.println("rowNumber > 2");
            double halfD = rowNumber / 2;

            int half = (int) Math.ceil(halfD);

            System.out.println("half " + half);
            for (int i = 1; i < half; i++) {
                --secondNumber;

                // System.out.println(previousChildlist);
                //System.out.println(oddRowNumber);
                value = previousChildlist.get(i-1) + previousChildlist.get(i);

                System.out.println("first add value" + value +" at" + i );
                childList.add(i, value);
                System.out.println(childList);


                //value = previousChildlist.get(i-1) + previousChildlist.get(i);
                System.out.println("second add value" + value +" at" + secondNumber);
                childList.add(secondNumber, value);
                System.out.println(childList);


            }
            if(oddRowNumber){
                value = previousChildlist.get(half-1) + previousChildlist.get(half);
                childList.add(half, value);
            }
        }


        //System.out.println(rowNumber);
        //System.out.println(lastIndex);
        //System.out.println(childList.size());
        if(rowNumber > 1){


            childList.add(lastIndex, 1);

        }





        return childList;
    }

    private List<Integer> createRow1(int rowNumber, List<Integer> previousChildlist) {

        int sizePreviousChild = previousChildlist.size();

        List<Integer> childList = new ArrayList<>(rowNumber);

        boolean add1 = sizePreviousChild <= 1;

        int value;
        for (int i = 0; i < rowNumber; i++) {
           // System.out.println(previousChildlist);
            boolean firstOrLast = (i ==0 || i == (rowNumber-1));
            if(add1 || firstOrLast){

                value = 1;
                childList.add(i, value);

            }else{


                value = previousChildlist.get(i-1) + previousChildlist.get(i);
                childList.add(i, value);
            }


        }

        return childList;
    }

    public static void main(String[] args){
        try {
            PascalTriangle triangle = new PascalTriangle(10);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }



}
