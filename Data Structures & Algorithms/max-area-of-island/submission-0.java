class Solution {

    int[] x = {-1,1,0,0};
    int[] y = {0,0,-1,1};
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    int count = dfs(grid, visited, i, j);
                    if(count>max){
                        max=count;
                    }
                }   
            }
        }
        return max;  
    }


     public boolean isValid(int i, int j, int[][] grid,boolean[][] visited){
  int n = grid.length;
        int m = grid[0].length;

        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]==0 || visited[i][j]){
            return false;
        }
        return true;
    }

    public int dfs(int[][] grid,boolean[][] visited, int i, int j){
          visited[i][j] = true;
          int count=1;
          for(int p=0;p<4;p++){
            int nx= i+x[p];
            int ny= j+y[p];
            if(isValid(nx,ny, grid, visited)){
                count=count+dfs(grid,visited, nx,ny);
            }
          }
          return count;
    }

}
