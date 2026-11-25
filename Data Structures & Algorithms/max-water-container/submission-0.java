class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                int bar=Math.min(heights[i],heights[j]);
                int width=j-i;
                int currwater= bar*width;

                 max=Math.max(max,currwater);
            }
        }

        return max;


        
    }
}
