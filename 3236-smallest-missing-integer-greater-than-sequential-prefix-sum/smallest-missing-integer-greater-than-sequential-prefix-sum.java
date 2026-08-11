class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length==1){
            return nums[0]+1;
        }
        HashSet<Integer> set=new HashSet<>();
        set.add(nums[0]);
        int curr_sum=nums[0];
        int i;
        for(i=1;i<nums.length;i++){
            set.add(nums[i]);
            if(nums[i]==nums[i-1]+1){
                curr_sum+=nums[i];
            }else{
                break;
            }
        }
        for(int j=i;j<nums.length;j++){
            set.add(nums[j]);
        }
        for(int j=curr_sum;j<=50;j++){
            if(set.contains(j)){
                curr_sum++;
                continue;
            }else{
                break;
            }
        }
        return curr_sum;
    }
}