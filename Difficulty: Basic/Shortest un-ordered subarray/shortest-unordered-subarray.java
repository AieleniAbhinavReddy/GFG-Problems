// User function Template for Java

class Solution {

    public int shortestUnorderedSubarray(int arr[]) {
        int l=0,r=arr.length-1,n=arr.length;
        while(l<n-1){
            if(l==n-2){
                if(arr[l]<arr[l+1]){
                    l++;
                    break;
                }
            }
            if(arr[l]>arr[l+1]) break;
            l++;
        }
        while(r>0){
            if(r==1){
                if(arr[1]>arr[0]){
                    r--;
                    break;
                }
            }
            if(arr[r]<arr[r-1]) break;
            r--;
        }
        if(Math.abs(l-r)==n-1) return 0;
        if(Math.abs(l-r)==0) return 0;
        return Math.abs(l-r)+2;
    }
}