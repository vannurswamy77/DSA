class Solution {
    public int majorityElement(int[] nums) {
        int majority=1;
        int element =nums[0];
        for(int i=1;i<nums.length;i++){
            if(majority==0){
                element=nums[i];
            }
            if(element ==nums[i]){
                majority++;
            }else{
                majority--;
            }
        }
        return element;
    }
}