class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max_count=0;
        int start=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>2){
                int fruit=nums[start];
                map.put(fruit,map.get(fruit)-1);
                if(map.get(fruit)==0){
                    map.remove(fruit);
                }
                start++;
            }
            max_count=Math.max(max_count,i-start+1);
        }
        return max_count;
    }
}