// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        int p1=arr[arr.length-1];
        int prev=arr[0];
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            arr[i]=prev;
            prev=curr;
        }
        arr[0]=p1;
    }
}