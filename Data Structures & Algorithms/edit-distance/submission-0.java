class Solution {

    Map<String, Integer> mp= new HashMap<>();
    public int minDistance(String word1, String word2) {
        return minDist(0,word1,0,word2);
    }

    public int minDist(int index1, String word1, int index2, String word2){


    if(index1==word1.length()){
        return word2.length()-index2;
    }

    if(index2 == word2.length()){
        return word1.length()-index1;
    }
    String key= index1+"*"+index2;
    if(mp.containsKey(key)){
        return mp.get(key);
    }

    if(word1.charAt(index1)==word2.charAt(index2)){
        return minDist(index1+1, word1, index2+1, word2);
    }
  
  int ans = 1+ Math.min(Math.min(minDist(index1+1, word1, index2, word2),
minDist(index1+1, word1, index2+1, word2)),
minDist(index1, word1, index2+1, word2));
    mp.put(key,ans);
    return ans;
    }
}
