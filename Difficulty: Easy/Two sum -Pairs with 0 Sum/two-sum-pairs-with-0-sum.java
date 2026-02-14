import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        // 1. Sort the array - O(n log n)
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length - 1;
        
        // 2. Use two pointers to find pairs that sum to 0
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == 0) {
                // Found a valid pair
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                res.add(pair);
                
                int currentLeft = arr[left];
                int currentRight = arr[right];
                
                // Skip duplicate elements for 'left'
                while (left < right && arr[left] == currentLeft) {
                    left++;
                }
                // Skip duplicate elements for 'right'
                while (left < right && arr[right] == currentRight) {
                    right--;
                }
            } 
            else if (sum < 0) {
                left++; // Need a larger value
            } 
            else {
                right--; // Need a smaller value
            }
        }
        
        return res;
    }
}