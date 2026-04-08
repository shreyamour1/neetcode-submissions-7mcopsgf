class Solution {

    public int characterReplacement(String s, int k) {

        int[] freq= new int[26];
        int left=0;
        int maxFreq=0;
        int maxAns=0;
        for(int right=0;right<s.length();right++){
            Character m = s.charAt(right);
            freq[m-'A']++;
            maxFreq = Math.max(maxFreq, freq[m-'A']);

            while((right-left+1)-maxFreq>k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }
           maxAns= Math.max(maxAns, right-left+1);
           System.out.println(maxAns);
        }

    
        return maxAns;     
    }
}
