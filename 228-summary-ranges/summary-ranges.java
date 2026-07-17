class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<>();
        if(nums.length==0){
            return result;
        }
        String str=""+nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]-1){
                continue;
            }else{
                if(!str.equals(""+nums[i-1])){
                    str=str+"->"+nums[i-1];
                }
                result.add(str);
                str=""+nums[i];
            }
        }
        if(!str.equals(""+nums[nums.length-1])){
            str=str+"->"+nums[nums.length-1];
        }
        result.add(str);
        return result;
    }
}