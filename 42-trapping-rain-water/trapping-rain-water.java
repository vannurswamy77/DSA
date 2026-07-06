class Solution {
    public int trap(int[] height) {
      int leftmax=0;
      int rightmax=0;
      int start=0;
      int end=height.length-1;
      int total=0;
      while(start<=end){
        if(height[start]<=height[end]){
            if(leftmax>height[start]){
                total+=leftmax-height[start];
                
            }else{
                leftmax=height[start];
               
            }
            start++;
        }else{
            if(rightmax>height[end]){
                total+=rightmax-height[end];
            }else{
                rightmax=height[end];
            }
            end--;
        }
      }
      return total;
    }
}