// User function Template for Java

class Solution {
    public int findStepKeyIndex(int[] arr, int k, int x) {
        int i=0;
        while(i<arr.length){
            if(arr[i]==x){
                return i;
            }else{
                int jump=Math.abs(arr[i]-x)/k;
                i=i+Math.max(1,jump);
            }
        }
        return -1;
    }
}