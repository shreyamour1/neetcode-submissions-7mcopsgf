class Solution {

    Map<Integer,Integer> mp = new HashMap<>();
    public int numDecodings(String s) {

        return numDecode(0,s);
    }

    public int numDecode(int i, String s){

        if(i==s.length()){
            return 1;
        }

        if(s.charAt(i)=='0'){
            return 0;
        }

        if(mp.containsKey(i)){
            return mp.get(i);
        }
         
        int count = numDecode(i+1,s) ;
        if((i+1)<s.length() && Integer.parseInt(s.substring(i,i+2))<=26){
            count = count + numDecode(i+2,s);
        }
        mp.put(i, count);
        return count ;
    }
}
