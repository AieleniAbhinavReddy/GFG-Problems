class Solution {
    void pushZerosToEnd(int[] arr) {
        int curr=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[curr++]=arr[i];
                // arr[i]=0;
            }
        }
        for(int i=curr;i<arr.length;i++) arr[i]=0;
    }
}