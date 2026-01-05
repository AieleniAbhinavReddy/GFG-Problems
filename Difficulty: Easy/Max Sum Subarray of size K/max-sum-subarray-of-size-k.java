class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int msf=0,sum=0,s=0,e=k-1;
        for(int i=0;i<k;i++) sum+=arr[i];
        while(s<arr.length-k+1){
            if(s>0){
                sum+=arr[e];
                sum-=arr[s-1];
                msf=Math.max(msf,sum);
            }else{
                msf=Math.max(msf,sum);
            }
            s+=1;
            e+=1;
        }
        return msf;
    }
}