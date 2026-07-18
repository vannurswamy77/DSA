class Solution {
    public int findGCD(int[] nums) {
        int sma=nums[0];
        int gre=nums[0];
        for(int i=1;i<nums.length;i++){
            sma=Math.min(sma,nums[i]);
            gre=Math.max(gre,nums[i]);
        }
        while(sma!=0){
            int temp=sma;
            sma=gre%sma;
            gre=temp;
        }
        return gre;
    }
}