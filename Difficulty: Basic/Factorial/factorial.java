class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        int res=1;
        for(int i=2;i<=n;i++) res*=i;
        return res;
    }
}
