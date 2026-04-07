class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->(a[0]-b[0]));
        int n = intervals.length;
        int[] prev = intervals[0];
        List<int[]> ans=new ArrayList<>();
        for(int i=1;i<n;i++){
            int[] current = intervals[i];
            if(current[0]<=prev[1]){
                prev[1]=Math.max(current[1],prev[1]); 
            }
            else{
                 ans.add(prev);
                 prev=current;
            }
        }
        ans.add(prev);
        int[][] res= new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
        
    }
}
