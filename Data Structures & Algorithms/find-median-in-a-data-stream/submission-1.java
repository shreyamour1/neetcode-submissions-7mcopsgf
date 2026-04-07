class MedianFinder {
    PriorityQueue<Integer> minHeap;;
    PriorityQueue<Integer> maxHeap;


    public MedianFinder() {
        minHeap= new PriorityQueue<>();
        maxHeap= new PriorityQueue<>((a,b)->(b-a));
    }
    
    public void addNum(int num) {

        if(maxHeap.isEmpty() || num<maxHeap.peek()){
            maxHeap.add(num);
        }
        else{
           minHeap.add(num);
        }


            if(minHeap.size()>maxHeap.size()+1){
              maxHeap.add(minHeap.poll());
            }
            else if(maxHeap.size()>minHeap.size()+1){
                minHeap.add(maxHeap.poll());
            }

    }
    
    public double findMedian() {
         int x= minHeap.size();
         int y=maxHeap.size();

           if(x>y){
              return minHeap.peek();
            }
            else if (y>x){
                return maxHeap.peek();
            }
            else{
               return ((minHeap.peek()+maxHeap.peek())/2.0);
            }
       
         
        
    }
}
