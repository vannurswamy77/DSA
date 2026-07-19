class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        boolean found = false;
        int[] re = new int[2];
        re[1] = -1;
        re[0] = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                found = true;
                break;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (!found) {
            return re;
        }
        re[0]=mid;
        re[1]=mid;
        int temp = mid - 1;
        while (temp >= 0 && nums[temp] == target) {
            re[0] = temp;
            temp--;
        }

        temp = mid + 1;
        while (temp < nums.length && nums[temp] == target) {
            re[1] = temp;
            temp++;
        }
        return re;
    }
}