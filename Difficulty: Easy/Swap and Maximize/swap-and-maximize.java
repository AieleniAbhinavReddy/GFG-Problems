// User function Template for Java

class Solution {
    public long maxSum(Long[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        long sum=0;
        for(int i=0;i<n/2;i++){
            sum-=arr[i];
            sum+=arr[n-i-1];
        }
        return 2*sum;
    }
}
