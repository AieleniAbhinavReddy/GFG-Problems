class Solution {
    int maxSubarraySum(int[] arr) {
        int msf=Integer.MIN_VALUE;
        int ms=0;
        for(int i=0;i<arr.length;i++){
            ms+=arr[i];
            if(ms>msf) msf=ms;
            if(ms<0) ms=0;
        }
        return msf;
    }
}
