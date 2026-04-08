class Solution {
    public int maxArea(int[] heights) {


        int l =0;
        int h = heights.length-1;
        int maxArea=0;
        while(l<h){
            int area = Math.min(heights[l],heights[h])*(h-l);
            if(heights[l]<heights[h]){
                l++;
            }
            else
            {
                h--;
            }

            if(area>maxArea){
               maxArea=area; 
            }

        }
        return maxArea;    
    }
}
