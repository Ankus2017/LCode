package numberOfIslands200;

//COMEBACK
class NumberOfIslands2<example1> {

    /*
    Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1

Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3

     */

   public static char[][]  exemple1 = {
           {'1','1','1','1','0'},
           {'1','1','0','1','0'},
           {'1','1','0','0','0'},
           {'0','0','0','0','0'}
   };


    public static char[][]     exemple2 =  {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}};

    //COMEBACK5
    public static int numIslands(char[][] grid){
        int counter = 0;

        int rowLength = grid.length;

        int columnLength = grid[0].length;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if(grid[i][j] == '1'){
                    counter++;
                    searchIsland(grid, i, j);
                }
            }
        }


        return counter;

    }

    public static void searchIsland(char[][] grid, int i, int j) {
        int rowLength = grid.length;

        int columnLength = grid[0].length;
        if(i < 0 || i >= rowLength || j < 0 || j >= columnLength || grid[i][j] =='0'){
            return;
        }
        grid[i][j] = '0';

        //left
        searchIsland(grid, i-1, j);

        //right
        searchIsland(grid, i+1, j);

        //up
        searchIsland(grid, i, j-1);

        searchIsland(grid, i, j+1);


    }

    public static void main(String[] args){

        System.out.println(numIslands(exemple1));
        System.out.println(numIslands(exemple2));


    }
}