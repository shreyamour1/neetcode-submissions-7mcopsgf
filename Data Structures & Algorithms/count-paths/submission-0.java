class Solution {


    Map<String, Integer> mp= new HashMap<>();    
    public int uniquePaths(int m, int n) {
        return uniPath(0,0,m,n);
    }

    public int uniPath(int i, int j, int m, int n){

        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || i<0 || j>=n || j<0){
            return 0;
        }
        String key= i+"*"+j;
        if(mp.containsKey(key)){
            return mp.get(key);
        }
       
        int count = uniPath(i+1,j,m,n) + uniPath(i,j+1,m,n);
        mp.put(key,count);
        return count;
    }
}
