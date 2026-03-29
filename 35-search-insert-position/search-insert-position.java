class Solution {
    // insert
    public int searchInsert(int[] nums, int target) {
       int mid=0;
       int low=0;
       int high=nums.length-1;
       while(low<=high){
       mid=(low+high)/2;
       if(nums[mid]==target) return mid;
       else if(target>nums[mid]) low=mid+1;
       else high=mid-1;
       }
       return low;
    }
}