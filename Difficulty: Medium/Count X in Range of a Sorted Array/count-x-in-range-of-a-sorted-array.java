import java.util.*;

class Solution {
    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int[] q : queries) {
            int L = q[0];
            int R = q[1];
            int X = q[2];
            int first = findFirst(arr, L, R, X);
            if (first == -1) {
                res.add(0);
            } else {
                int last = findLast(arr, L, R, X);
                res.add(last - first + 1);
            }
        }
        return res;
    }
    private int findFirst(int[] arr, int low, int high, int target) {
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                res = mid;
                high = mid - 1; // Keep looking left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
    private int findLast(int[] arr, int low, int high, int target) {
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                res = mid;
                low = mid + 1; // Keep looking right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}