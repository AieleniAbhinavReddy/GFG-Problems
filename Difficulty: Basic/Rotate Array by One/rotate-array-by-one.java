// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        int n=arr.length;
        int ns=arr[n-1];
        int prev=arr[0];
        for(int i=1;i<n;i++){
            int curr=arr[i];
            arr[i]=prev;
            prev=curr;
        }
        arr[0]=ns;
    }
}
/*
Approach :
variable
loop

newstart=last element of original array
loop -> move all the elements to right by one step
place newstart at beginning of array


*/