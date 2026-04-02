class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->(b-a));

        int k=2;
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        if(stones.length==1){
            return stones[0];
        }

        while(pq.size()>1){
          int x= pq.poll();
          int y= pq.poll();
          if(x>y){
            pq.add(x-y);
          }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.peek();
        
    }
}
