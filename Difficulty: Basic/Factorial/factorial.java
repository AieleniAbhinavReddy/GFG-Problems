class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        int res=1;
        for(int i=2;i<=n;i++){
            res=res*i;
        }
        return res;
    }
}
/*
Factorial : it is product of all the numbers from 1 to n for a integer n

n=5
factorial of 5 = 1 X 2 X 3 X 4 X 5 = 120
*/
