// User function Template for Java

class Solution {
    int sumOfSeries(int n) {
        int res=((n*(n+1))/2);
        return res*res;
    }
}
/*
Approach :
formula = ((n*n+1)/2)^2

n=5
formula = ((5*6)/2)^2 = (30/2)^2 = 15^2 = 225
*/