package numberOfIslands200;

class NumberOfIslands<example1> {

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

    public static int numIslands(char[][] grid){

        int counter = 0;
        int m = grid.length;

        int n = grid[0].length;

        if(m < 1 || n > 300){
            System.out.println("Error");
            return 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
              //  System.out.println(grid[i][j] );
                if(grid[i][j] == '1'){
                    counter++;
                    searchIsland(grid, i, j);
                }

            }

        }

        return counter;

    }

    public static void searchIsland(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] =='0'){
            return;
        }
        grid[i][j] = '0';
        searchIsland(grid, i+1, j); //up
        searchIsland(grid, i-1, j); //down
        searchIsland(grid, i, j-1); //left
        searchIsland(grid, i, j+1); //right
    }

    public static void main(String[] args){

        System.out.println(numIslands(exemple1));
        System.out.println(numIslands(exemple2));
    }
}