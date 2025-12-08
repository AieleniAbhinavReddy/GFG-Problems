// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n=arr.length;
        int[] lp=new int[n];
        int[] rp=new int[n];
        lp[0]=1;
        rp[n-1]=1;
        for(int i=1;i<n;i++){
            lp[i]=lp[i-1]*arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rp[i]=rp[i+1]*arr[i+1];
        }
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=lp[i]*rp[i];
        }
        return p;
    }
}
