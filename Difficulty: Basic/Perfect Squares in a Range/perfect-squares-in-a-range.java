// User function Template for Java

class Solution {
    static int numOfPerfectSquares(int a, int b) {
        int c=0;
        for(int i=a;i<=b;i++){
            int t=(int)Math.sqrt(i);
            if(t*t==i) c++;
        }
        return c;
    }
};