class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxLength = 0;
        while(left < right){
            int currentLength = (right - left) * Math.min(heights[left],heights[right]);
           
            maxLength = Math.max(maxLength,currentLength);

            if(heights[left] < heights[right]){
                left++;
            } else right--;
        }
        return maxLength;
    }
}

