// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int less=0,greater=0;
        for(int n:arr){
            if(n<target){
                less++;
            }
            else if(n>target){
                greater++;
            } 
            else{
                less++;
                greater++;
            }
        }
        int[] res={less,greater};
        return res;
    }
}