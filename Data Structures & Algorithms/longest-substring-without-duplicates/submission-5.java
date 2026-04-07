class Solution {


    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> mp = new HashMap<>();
        int start=0;
        int max=0;
        int n =s.length();
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        for(int i=0;i<n;i++){
            Character t= s.charAt(i);
            if(mp.containsKey(t)){
                int index = mp.get(t);
                start=Math.max(start,index+1);
            }
            max=Math.max(max, i-start+1);  
            mp.put(t,i);
        }
        return max;
    }
}
