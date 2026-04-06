class Solution {
  
    public int[] dailyTemperatures(int[] temp) {
          Stack<Integer> st= new Stack<>();
          int[] result = new int[temp.length];

          for(int i=0;i<temp.length;i++){
            if(st.isEmpty()){
                st.push(i);
            }
            while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                result[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
          }

          while(!st.isEmpty()){
            result[st.pop()]=0;
          }
          return result;
        
    }
}
