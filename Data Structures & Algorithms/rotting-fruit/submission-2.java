class Pair{

    int x;
    int y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class Solution {

    int[] x1={-1,1,0,0};
    int[] y1={0,0,-1,1};

    public  boolean isValid(int i, int j, int n , int m){
        if(i<0 || j<0 || i>=n || j>=m){
            return false;
        }
        return true;
    }

    public int orangesRotting(int[][] grid) {
 //bfs
        int time=-1;
        int n = grid.length;
        int m =grid[0].length;
        Queue<Pair> q= new LinkedList<>();
        int[][] visited = new int[n][m];
        int freshcount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                  q.add(new Pair(i,j));
                }
                if(grid[i][j]==1){
freshcount++;
                }
            }
        }

        if(freshcount==0){
            return 0;
        }

        while(!q.isEmpty()){
            int size=q.size();
            time++;
            while(size>0){
                Pair p = q.poll();
                for(int i=0;i<4;i++){
                    int px=p.x+x1[i];
                    int py=p.y+y1[i];
                    if(isValid(px,py,n,m) && grid[px][py]==1){
                        q.add(new Pair(px,py));
                        grid[px][py]=2;
                    }
                }
                size--;
            }
        }
            for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                  return -1;
                }
            }
        }
        return time;
       
    }
}
