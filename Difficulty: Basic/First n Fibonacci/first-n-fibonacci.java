// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        int[] arr=new int[n];
        if(n==0 || n==1) return arr;
        if(n==2){
            arr[1]=1;
            return arr;
        }
        arr[0]=0;
        arr[1]=1;
        n-=2;
        int i=2;
        while(n-->0){
            arr[i]=arr[i-1]+arr[i-2];
            i++;
        }
        return arr;
    }
}