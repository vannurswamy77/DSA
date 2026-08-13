class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> list = new ArrayList<>();

        // Find first element >= x
        int index = binarySearch(arr, x);

        int left = index - 1;
        int right = index;

        // Pick k closest elements
        for (int i = 0; i < k; i++) {

            if (left < 0) {
                list.add(arr[right]);
                right++;
            }
            else if (right >= arr.length) {
                list.add(arr[left]);
                left--;
            }
            else {
                int diff1 = Math.abs(arr[left] - x);
                int diff2 = Math.abs(arr[right] - x);

                if (diff1 <= diff2) {
                    list.add(arr[left]);
                    left--;
                }
                else {
                    list.add(arr[right]);
                    right++;
                }
            }
        }

        // Elements must be in sorted order
        Collections.sort(list);

        return list;
    }

    // Finds the first index where arr[index] >= x
    public int binarySearch(int[] arr, int x) {

        int start = 0;
        int end = arr.length;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < x) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }

        return start;
    }
}