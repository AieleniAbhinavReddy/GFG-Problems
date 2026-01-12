class Solution {
    static int closestNumber(int n, int m) {
        // quotient
        int q = n / m;
        // First possible closest multiple
        int n1 = q * m;
        // Second possible closest multiple
        int n2;
        if (n * m > 0) {
            n2 = (q + 1) * m;
        } else {
            n2 = (q - 1) * m;
        }
        // Compare distances
        if (Math.abs(n - n1) < Math.abs(n - n2)) {
            return n1;
        } else if (Math.abs(n - n1) > Math.abs(n - n2)) {
            return n2;
        } else {
            // If both are equally close, return the one with maximum absolute value
            return Math.abs(n1) > Math.abs(n2) ? n1 : n2;
        }
        
    }
}/*
Approach

*/