class Solution {
    public boolean isAnagram(String s, String t) {

      int[] s1 = new int[26];
      int[] t1= new int[26];

      for(int i=0;i<s.length();i++){
        int m = s.charAt(i)-97;
        s1[m]=s1[m]+1;
              }

                for(int i=0;i<t.length();i++){
        int m = t.charAt(i)-97;
        t1[m]=t1[m]+1;
              }

              for(int i=0;i<26;i++){
                if(s1[i]!=t1[i]){
                  return false;
                }
              }

              return true;

    }
}
