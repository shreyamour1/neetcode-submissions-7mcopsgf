 private final class Point {
        final int idx;
        final long dist;
        public Point(int idx, long dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }


class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Point> pq= 
        new PriorityQueue<>((a,b)-> Long.compare(b.dist,a.dist));
    
        
        int[][] ans = new int[k][2];

        for(int i=0;i<points.length;i++){
            pq.add(
                new Point(i,points[i][0]*points[i][0]+points[i][1]*points[i][1]));
            if(pq.size()>k){
                pq.poll();
            }
        }

        for(int i=0;i<k;i++){
            Point p= pq.poll();
            ans[i][0] = points[p.idx][0];
            ans[i][1] = points[p.idx][1];
        }

        return ans;

        

    }
}
