package rotateMatrix;

import java.util.Scanner;

public class RotateMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Get the number of rows and columns for the matrix
        System.out.print("Enter the number of rows and columns: ");
        int rows = scanner.nextInt();
        int columns = rows;

// Create the matrix
        int[][] matrix = new int[rows][columns];

// Get the matrix elements from the user
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the rotated matrix
        System.out.println(" matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

// Rotate the matrix 90 degrees clockwise
        int[][] rotatedMatrix = rotateMatrixClockwise(matrix);

// Print the rotated matrix
        System.out.println("Rotated matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(rotatedMatrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    // Function to rotate the matrix 90 degrees clockwise
    public static int[][] rotateMatrixClockwise(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] rotatedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int r = j;
                int c = rows - 1 - i;
                rotatedMatrix[r][c] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    // Function to rotate the matrix 90 degrees clockwise
    public static int[][] rotateMatrixClockwise2(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] rotatedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns/2; j++) {

                if(i!=j){
                    //swapping elements of the first column with last column
                    int temp = matrix[i][j];
                    rotatedMatrix[i][j]=matrix[i][columns-j-1];
                    rotatedMatrix[i][columns-j-1]=temp;
                }

            }
        }

        return rotatedMatrix;
    }

}
