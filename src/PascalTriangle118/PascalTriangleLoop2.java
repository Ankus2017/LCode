package PascalTriangle118;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleLoop2 {

    public static void main(String[] args){

        System.out.println(createTriangle(7));
    }


    public static List<List<Integer>> createTriangle(int numRows){
        List<List<Integer>> triangle =  new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        triangle.add(secondRow);

        List<Integer> lastRow = secondRow;

        for (int i = 2; i < numRows ; i++) {
            List<Integer> row = new ArrayList<>();
            System.out.println("i " +i);
            row.add(1);
            for (int j = 1; j < i; j++) {
                System.out.println(j-1);
                System.out.println(j);
                int value = lastRow.get(j-1) + lastRow.get(j);
                System.out.println("value " +value);
                row.add(value);
            }
            row.add(1);
            triangle.add(row);
            lastRow = row;

        }

        return triangle;
    }


}
