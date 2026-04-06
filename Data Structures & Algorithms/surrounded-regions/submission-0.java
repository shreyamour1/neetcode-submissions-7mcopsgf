class Solution {

   public boolean isValid(int i, int j , int n, int m){
    if(i<0 || i>=n || j<0 || j>=m){
        return false;
    }
     return true;
   }

   int[] x={-1,1,0,0};
   int[] y={0,0,-1,1};
 
    public void solve(char[][] board) {
        
        int n = board.length;
        int m = board[0].length;

        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            if(board[i][0]=='O' && !visited[i][0]){
                dfs(board,visited,i,0);
            }
        }
         for(int i=0;i<n;i++){
            if(board[i][m-1]=='O' && !visited[i][m-1]){
                dfs(board,visited,i,m-1);
            }
        }
         for(int i=0;i<m;i++){
            if(board[0][i]=='O' && !visited[0][i]){
                dfs(board,visited,0,i);
            }
        }
         for(int i=0;i<m;i++){
            if(board[n-1][i]=='O' && !visited[n-1][i]){
                dfs(board,visited,n-1,i);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && !visited[i][j]){
                    board[i][j]='X';
                }
            }
        } 
    }

    public void dfs(char[][] board, boolean[][] visited,int i, int j){

        visited[i][j]=true;
        for(int p=0;p<4;p++){
            int nx=i+x[p];
            int ny=j+y[p];
            if( isValid(nx,ny, board.length, board[0].length) && !visited[nx][ny] && board[nx][ny]=='O'){
                dfs(board,visited,nx,ny);
            }
        }
    }
}
