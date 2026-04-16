class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0){
            return false;
        }
       Set<Integer> set=new HashSet<>();
       for(int num:nums){
        set.add(num);
       }
       if(set.size()==nums.length){
        return false;
       }else{
        return true;
       }
    }
}