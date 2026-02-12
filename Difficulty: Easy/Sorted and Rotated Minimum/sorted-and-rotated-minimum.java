class Solution {
    public int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        // Binary Search
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                // The minimum is in the right half
                // We do mid + 1 because mid cannot be the minimum
                low = mid + 1;
            } else {
                // The minimum is in the left half (including mid)
                high = mid;
            }
        }

        // When low == high, we've found the minimum
        return arr[low];
    }
}