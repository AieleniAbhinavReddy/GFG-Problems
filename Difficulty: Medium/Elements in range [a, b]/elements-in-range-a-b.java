import java.util.*;

class Solution {
    // Find the first index i such that arr[i] >= a
    static int findLowerBound(int[] arr, int a) {
        int l = 0, r = arr.length - 1;
        int res = arr.length; // Default to length if no element >= a
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] >= a) {
                res = m;
                r = m - 1; // Keep looking left for a smaller index
            } else {
                l = m + 1;
            }
        }
        return res;
    }

    // Find the last index j such that arr[j] <= b
    static int findUpperBound(int[] arr, int b) {
        int l = 0, r = arr.length - 1;
        int res = -1; // Default to -1 if no element <= b
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] <= b) {
                res = m;
                l = m + 1; // Keep looking right for a larger index
            } else {
                r = m - 1;
            }
        }
        return res;
    }

    public ArrayList<Integer> cntInRange(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr); // Ensure array is sorted (O(N log N))
        
        for (int[] q : queries) {
            int lowVal = q[0];
            int highVal = q[1];
            
            int startIndex = findLowerBound(arr, lowVal);
            int endIndex = findUpperBound(arr, highVal);
            
            if (startIndex <= endIndex) {
                list.add(endIndex - startIndex + 1);
            } else {
                list.add(0);
            }
        }
        return list;
    }
}