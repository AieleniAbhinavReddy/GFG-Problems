// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        int[] res=new int[n];
        if(n==1) return res;
        res[0]=0;
        res[1]=1;
        for(int i=2;i<n;i++){
            res[i]=res[i-1]+res[i-2];
        }
        return res;
    }
}
/*
Fibonacci numbers : they are a series of numbers which are generated using a logic
fibonacci number sequence starts from a=0 , b=1
formula for generating fibonacci numbers : c=a+b

n=5
0 1 1 2 3

*/