class Solution {
    static boolean searchInSorted(int arr[], int k) {
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==k) return true;
            if(arr[m]>k) r=m-1;
            if(arr[m]<k) l=m+1;
        }
        return false;
    }
}