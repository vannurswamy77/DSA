class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int k=2;
        int temp[]=new int[nums.length];
        temp[0]=nums[0];
        temp[1]=nums[1];
        for(int i=2;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                if(temp[k-1]==temp[k-2]){
                    continue;
                }else{
                    temp[k]=nums[i];
                    k++;
                }
            }else{
                temp[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        return k;
    }
}