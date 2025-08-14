// User function Template for Java

class Solution {
    int maxNtype(int arr[]) {
        boolean is1=true,is2=true,is3=true,is4=true;
        int mini=0,maxi=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                is1=false;
            }
        }
        if(is1) return 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                is2=false;
            }
        }
        if(is2) return 2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[mini]) mini=i;
            if(arr[i]>arr[maxi]) maxi=i;
        }
        if(mini>maxi) is3=false;
        if(is3) return 3;
        if(is4) return 4;
        return -1;
    }
}
