class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int n=nums.length;
        int fual=nums[0];
        for(int i=1;i<n;i++){
            if(fual==0){
                return false;
            }
            if(nums[i]>=fual){
                fual=nums[i];
            }else{
                fual--;
            }
        }
        return true;
    }
}