class Solution {
    public int findKRotation(int arr[]) {
        if(arr.length==1) return 0;
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxi]) maxi=i;
        }
        if(maxi==arr.length-1) return 0;
        return maxi+1;
    }
}