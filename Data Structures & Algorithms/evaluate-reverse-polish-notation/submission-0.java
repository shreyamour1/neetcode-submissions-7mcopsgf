class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<tokens.length;i++){
            String s = tokens[i];
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                if(s.equals("+")){
                  int x= st.pop();
                  int y =st.pop();
                  st.push(x+y);
                }
                if(s.equals("-")){
                    int x= st.pop();
                  int y =st.pop();
                  st.push(y-x);

                }
                if(s.equals("*")){
                 int x= st.pop();
                  int y =st.pop();
                  st.push(x*y);
                }
                if(s.equals("/")){
                    int x= st.pop();
                  int y =st.pop();
                  st.push(y/x);

                }
            }
            else{
                
                Integer num= Integer.valueOf(s);
                st.push(num);
            }
        }

        return st.pop();
        
    }
}
