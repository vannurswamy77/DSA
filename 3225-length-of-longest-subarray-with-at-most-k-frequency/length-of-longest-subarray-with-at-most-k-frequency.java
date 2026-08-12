class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            int count = freq.getOrDefault(nums[right], 0) + 1;
            freq.put(nums[right], count);

            while (count > k) {
                int leftNum = nums[left];
                freq.put(leftNum, freq.get(leftNum) - 1);
                left++;
                
                count = freq.get(nums[right]);
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}