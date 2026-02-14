import java.util.*;

class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        // Requirement: Array must have at least two elements
        if (n < 2) {
            return result;
        }

        // 1. Sort the array - O(n log n)
        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;
        int minDiff = Integer.MAX_VALUE;
        int maxAbsDiff = -1;

        int resA = -1, resB = -1;

        // 2. Two-pointer approach
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            int currentDiff = Math.abs(target - currentSum);

            // 3. Update result if closer, or if equal diff but larger absolute diff
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                maxAbsDiff = arr[right] - arr[left];
                resA = arr[left];
                resB = arr[right];
            } else if (currentDiff == minDiff) {
                int currentAbsDiff = arr[right] - arr[left];
                if (currentAbsDiff > maxAbsDiff) {
                    maxAbsDiff = currentAbsDiff;
                    resA = arr[left];
                    resB = arr[right];
                }
            }

            // 4. Move pointers based on sum
            if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        result.add(resA);
        result.add(resB);
        return result;
    }
}