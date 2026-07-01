class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        int end=k-1;
        double sum=0;
        for(int i=start;i<=end;i++){
                sum+=nums[i];
            }
        double result=sum/k;
        while(end<nums.length-1){
            sum=sum-nums[start];
            sum=sum+nums[end+1];
            result=Math.max(result,sum/k);
            start+=1;
            end+=1;

        }
        return result;
    }
}