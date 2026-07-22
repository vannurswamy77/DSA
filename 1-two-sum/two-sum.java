class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(nums[0],0);
        int[] re=new int[2];
        for(int i=1;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                re[0]=map.get(target-nums[i]);
                re[1]=i;
                return re;
            }
            map.put(nums[i],i);
        }
        return re;
    }
}