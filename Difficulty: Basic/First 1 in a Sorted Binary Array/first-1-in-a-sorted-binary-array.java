// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) {
        long res=-1;
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==1){
                res=m;
                r=m-1;
            }
            if(arr[m] != 1){
                l=m+1;
            }
        }
        return res;
    }
}