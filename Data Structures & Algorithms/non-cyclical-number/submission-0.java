class Solution {
    Set<Integer> seen = new HashSet<>();

    public boolean isHappy(int n) {

          if(n==1){
            return true;
          }
             if(seen.contains(n)){
            return false;
          }
          seen.add(n);
          int res=0;
          while(n>0){
            int rem= n%10;
            n=n/10;
            res=res+rem*rem;
          }
       
          return isHappy(res);
    }
}
