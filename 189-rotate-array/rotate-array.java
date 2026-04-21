class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int temp[]=new int[nums.length];
        for(int j=0;j<nums.length;j++){
            temp[(j+k)%(nums.length)]=nums[j];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
       return;
    }
}