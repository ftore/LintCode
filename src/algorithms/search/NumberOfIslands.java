package algorithms.search;

public class NumberOfIslands {
	/**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    public int numIslands(boolean[][] grid) {
        // Write your code here
        if(grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
            
        int count = 0;
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]) {
                    count++;
                    merge(grid, i, j);
                }
            }
        }
        
        return count;
    }

    public void merge(boolean[][] grid, int i, int j) {
        //validity checking
        if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1)
            return;
 
        //if current cell is water or visited
        if(!grid[i][j]) return;
 
        //set visited cell to '0'
        grid[i][j] = false;

        //merge all adjacent land
        merge(grid, i-1, j);
        merge(grid, i+1, j);
        merge(grid, i, j-1);
        merge(grid, i, j+1);
    }
}
