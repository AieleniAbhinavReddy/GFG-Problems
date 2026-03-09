// User function Template for Java

class Solution {
    // Function to find the minimum length of a subset
    int minSubset(int[] arr) {
        Arrays.sort(arr);
        int sum=0;
        for(int n:arr) sum+=n;
        int sum2=0,c=0;
        for(int i=arr.length-1;i>=0;i--){
            sum2+=arr[i];
            c++;
            if(sum2>(sum-sum2)) break;
        }
        return c;
    }
}