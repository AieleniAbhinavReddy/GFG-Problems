import java.util.*;

class Solution {
    public static int findSum(int A[], int N) {
        // 1. Initialize min and max to extreme values
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 2. Traverse the array once
        for (int i = 0; i < N; i++) {
            // Update max if current element is larger
            if (A[i] > max) {
                max = A[i];
            }
            
            // Update min if current element is smaller
            if (A[i] < min) {
                min = A[i];
            }
        }

        // 3. Return the sum as requested
        return max + min;
    }
}