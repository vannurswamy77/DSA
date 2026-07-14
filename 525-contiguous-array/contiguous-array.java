class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int total=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                total += -1;
            }
            else{
                total += 1;
            }
            if(total==0){
                result=Math.max(result,i+1);
            }
            if(map.containsKey(total)){
                result=Math.max(i-map.get(total),result);
                continue;
            }
            map.put(total,i);
        }
        return result;
    }
}