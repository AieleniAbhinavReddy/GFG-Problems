class Solution {
    public static boolean isPowerofTwo(int n) {
        return (n & n-1) == 0 ? true:false;
    }
}