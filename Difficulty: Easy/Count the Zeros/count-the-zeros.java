// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
        int count=0;
        for(int n:arr) if(n==0) count++;
        return count;
    }
}
