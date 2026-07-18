class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int gre=nums[nums.length-1];
        int sma=nums[0];
        while(sma!=0){
            int temp=sma;
            sma=gre%sma;
            gre=temp;
        }
        return gre;
    }
}