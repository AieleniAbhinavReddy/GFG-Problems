import java.util.*;

class Solution {
    public static int findPosition(int n) {
        // 1. Check if n is a power of 2 (has exactly one set bit)
        // If n is 0 or has more than one set bit, return -1
        if (n <= 0 || (n & (n - 1)) != 0) {
            return -1;
        }

        int position = 0;
        
        // 2. Count positions until we hit the set bit
        while (n > 0) {
            n = n >> 1; // Shift right by 1
            position++;
        }

        return position;
    }
}