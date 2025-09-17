class Solution {
    public int maxArea(int[] height) {
        int i =0,  max_area =0, j = height.length-1;
        while(i<j){
            int h = Math.min(height[i],height[j]);
            int w = j-i;
            int curr_area = h*w;
            max_area = Math.max(max_area, curr_area);
            if (height[i]<height[j] ){
                i++;
            }
            else 
            j--;
        }
    return max_area;

    }
}