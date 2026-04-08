class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x=x;
        this.y=y;   
    }
}

class Solution {

    public boolean isValid(int i, int j, int n, int m){
        if(i<0 || i>=n || j<0 || j>=m){
            return false;
        }
        return true;
    }

    int[] x1= {-1,1,0,0};
    int[] y1 = {0,0,-1,1};
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited= new boolean[n][m];

     Queue<Point> pq= new LinkedList<>();
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==0){
                pq.add(new Point(i,j));
                visited[i][j]=true;
            }
        }
     }

     int dist=0;
     while(!pq.isEmpty()){
        int s= pq.size();
        dist++;
        while(s>0){
            Point p = pq.poll();

            for(int i=0;i<4;i++){
                int nx=p.x+x1[i];
                int ny=p.y+y1[i];
                if(isValid(nx,ny,n,m) && grid[nx][ny]!=-1 && !visited[nx][ny]){
                    visited[nx][ny]=true;
                    pq.add(new Point(nx,ny));
                    grid[nx][ny]=Math.min(grid[nx][ny],dist);
                }
            }
            s--;
        }
     }
        
    }
}
