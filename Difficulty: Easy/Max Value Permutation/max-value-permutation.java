// User function Template for Java

class Solution {

    int maxValue(int arr[]) {
        int n = arr.length;
        long mod = 1000000007L;
        
        // Step 1: Sort the array to pair large numbers with large indices
        Arrays.sort(arr);
        
        long maxSum = 0;
        
        // Step 2: Calculate sum of arr[i] * i
        for (int i = 0; i < n; i++) {
            // Cast to long before multiplication to prevent overflow
            maxSum = (maxSum + (long)arr[i] * i) % mod;
        }
        
        return (int)maxSum;
    }
}
