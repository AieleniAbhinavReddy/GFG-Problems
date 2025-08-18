
class Solution {
    public static int largest(int[] arr) {
        int max=-1;
        for(int n:arr) if(max<n) max=n;
        return max;
    }
}
