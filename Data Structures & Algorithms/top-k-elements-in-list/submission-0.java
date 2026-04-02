class Solution {
    public int[] topKFrequent(int[] nums, int k) {

      Map<Integer, Integer> mp= new HashMap<>();
      for(int i=0;i<nums.length;i++){
        mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
      }
      PriorityQueue<Integer> p= 
      new PriorityQueue<>((a,b)-> mp.get(a)-mp.get(b));

     for(Integer i:mp.keySet()){
      p.add(i);
      if(p.size()>k){
        p.poll();
      }
     }
     int[] ans = new int[k];
     for(int i=0;i<k;i++){
      ans[i]=p.poll();
     }
     return ans;
      
        
    }
}
