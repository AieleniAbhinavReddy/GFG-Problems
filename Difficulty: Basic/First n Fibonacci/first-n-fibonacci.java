// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        int[] res=new int[n];
        if(n==1) return res;
        res[0]=0;
        res[1]=1;
        for(int i=2;i<res.length;i++){
            res[i]=res[i-1]+res[i-2];
        }
        return res;
    }
}