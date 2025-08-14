// User function Template for Java

class Solution {
    // Function to find the minimum value required to balance the array.
    public int minValueToBalance(List<Integer> arr) {
        int lsum=0,rsum=0;
        int l=0,r=arr.size()-1;
        while(l<r){
            lsum+=arr.get(l++);
            rsum+=arr.get(r--);
        }
        return Math.abs(lsum-rsum);
    }
}