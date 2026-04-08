class Solution {


    public boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> mp1 = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            Character a = s1.charAt(i);
            mp1.put(a,mp1.getOrDefault(a,0)+1);
        }

        for(int i=0;i<=(s2.length()-s1.length());i++){
            Map<Character, Integer> mp2 = new HashMap<>();
            for(int j=i;j<i+s1.length();j++){
                 Character a = s2.charAt(j);
                 mp2.put(a,mp2.getOrDefault(a,0)+1);
            }
            if(mp1.equals(mp2)){
                return true;
            }
        }
        return false; 
    }
}
