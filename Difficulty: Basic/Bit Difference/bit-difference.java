import java.util.*;

class Solution {
    // Function to find number of bits to be flipped to convert a to b
    public static int countBitsFlip(int a, int b) {
        
        // 1. XOR a and b to find differing bits
        int xorResult = a ^ b;
        
        // 2. Count the number of set bits (1s) in xorResult
        int count = 0;
        
        // Using Brian Kernighan’s Algorithm for efficiency
        while (xorResult > 0) {
            // This operation clears the rightmost set bit
            xorResult = xorResult & (xorResult - 1);
            count++;
        }
        
        return count;
    }
}