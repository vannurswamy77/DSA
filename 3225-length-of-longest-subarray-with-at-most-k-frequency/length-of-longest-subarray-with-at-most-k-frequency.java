class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max_length=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int start=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i])>k){
                map.put(nums[start],map.getOrDefault(nums[start],0)-1);
                start++;
            }
            max_length=Math.max(i+1-start,max_length);
        }
        return max_length;
    }
}