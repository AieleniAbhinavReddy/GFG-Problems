class Solution {
    static int helper(int[] arr, int k, int l, int r) {
        if (l > r) {
            return -1;
        }
        int m = l + (r - l) / 2;
        if (arr[m] == k) {
            if (m == 0 || arr[m - 1] != k) {
                return m;
            } else {
                return helper(arr, k, l, m - 1);
            }
        } else if (arr[m] < k) {
            return helper(arr, k, m + 1, r);
        } else {
            return helper(arr, k, l, m - 1);
        }
    }
    public int binarysearch(int[] arr, int k) {
        return helper(arr, k, 0, arr.length - 1);
    }
}