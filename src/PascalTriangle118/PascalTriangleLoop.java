package PascalTriangle118;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleLoop {

    public static void main(String[] args){
        createTriangle(5);
    }


    public static List<List<Integer>> createTriangle(int numRows){
        List<List<Integer>> triangle =  new ArrayList<>();

        if(numRows == 0) return triangle;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        System.out.println(first_row);
        triangle.add(first_row);

        List<Integer> previous_row = first_row;

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(previous_row.get(j-1) + previous_row.get(j));
            }

            row.add(1);
            triangle.add(row);
            previous_row = row;
            System.out.println(row);
        }
        return triangle;
    }


}
