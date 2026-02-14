import java.util.*;

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // 1. Edge case: If there are no packets or students
        if (m == 0 || arr.size() == 0) {
            return 0;
        }

        // 2. Sort the list to bring closer values together
        Collections.sort(arr);

        int n = arr.size();
        
        // 3. Initialize minimum difference with a very large value
        int minDiff = Integer.MAX_VALUE;

        // 4. Slide a window of size m through the sorted array
        // The window starts at 'i' and ends at 'i + m - 1'
        for (int i = 0; i <= n - m; i++) {
            int currentDiff = arr.get(i + m - 1) - arr.get(i);
            
            // Update minDiff if a smaller difference is found
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
            }
        }

        return minDiff;
    }
}