// User function Template for Java

class Solution {
    // Function to find the maximum element from array arr1 and
    // the minimum element from array arr2 and return their product.
    public long findMultiplication(int[] arr1, int[] arr2) {
        int max=arr1[0];
        int min=arr2[0];
        for(int n:arr1){
            if(n>max) max=n;
        }
        for(int n:arr2){
            if(n<min) min=n;
        }
        return max*min;
    }
}