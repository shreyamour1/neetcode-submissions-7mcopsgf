class Solution {
    public boolean isPalindrome(String s) {

      String modified="";

      for(int i=0;i<s.length();i++){
        if(isAlphaNumneric(s.charAt(i))){
             modified = modified+s.charAt(i);
        }
      }
      modified= modified.toLowerCase();
   // System.out.println(modified);
      int i=0;
      int j =modified.length()-1;

      while(i<j){
        if(modified.charAt(i)!=modified.charAt(j)){
          return false;
        }
        i++;j--;
      }
      return true;

    }

    public boolean isAlphaNumneric(Character a){

      if(a>='a'&& a<='z'){
        return true;
      }
       if(a>='A'&& a<='Z'){
        return true;
      }
       if(a>='0'&& a<='9'){
        return true;
      }
      return false;

    }
}
