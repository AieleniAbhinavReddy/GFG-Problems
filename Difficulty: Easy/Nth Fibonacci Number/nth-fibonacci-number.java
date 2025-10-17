// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        int a=0,b=1,c=0;
        if(n==0) return a;
        if(n==1) return b;
        while(n-->1){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}