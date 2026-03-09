// User function Template for Java

class Solution {

    public static long maximizeSum(long a[], int n, int k) {
        Arrays.sort(a);
        for(int i=0;i<n&&k>0;i++){
            if(a[i]<0){
                a[i]=-a[i];
                k--;
            }
        }
        long sum=0;
        long min=Integer.MAX_VALUE;
        for(long num:a){
            sum+=num;
            min=Math.min(min,num);
        }
        if(k%2!=0){
            sum-=2*min;
        }
        return sum;
    }
}