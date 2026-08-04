class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int small=nums[0];
        int large=nums[0];
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            small=Math.min(small,nums[i]);
            large=Math.max(large,nums[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=small+1;i<large;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}