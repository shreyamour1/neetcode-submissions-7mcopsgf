class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      Map<String, List<String>> mp= new HashMap<>();
      List<List<String>>  ans = new ArrayList<>();

      for(int i=0;i<strs.length;i++){
        String p = strs[i];
        char[] mArr = p.toCharArray();
        Arrays.sort(mArr);
        p = new String(mArr);
        
        if(mp.containsKey(p)){
        List<String> ap = mp.get(p);
          ap.add(strs[i]);
          mp.put(p,ap);
        }
        else{
          List<String> ap = new ArrayList<>();
          ap.add(strs[i]);
          mp.put(p,ap);
        }
      }

      for(String k : mp.keySet())
      {
        ans.add(mp.get(k));
      }

return ans;
        
    }
}
