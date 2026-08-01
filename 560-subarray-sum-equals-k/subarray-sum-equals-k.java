class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0,total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            if(map.containsKey(total-k)){
                count+=map.get(total-k);
            }
            map.put(total,map.getOrDefault(total,0)+1);
        }
        return count;
    }
}