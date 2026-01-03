class Solution {
    public int findPages(int[] arr, int k) {
        int n = arr.length;
        if (k > n) return -1;
        int low = 0, high = 0;
        for (int page : arr) {
            low = Math.max(low, page);
            high += page;
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] arr, int k, int mid) {
        int students = 1;
        int currSum = 0;
        for (int page : arr) {
            if (currSum + page > mid) {
                students++;
                currSum = page;
                if (students > k) return false;
            } else {
                currSum += page;
            }
        }
        return true;
    }
}