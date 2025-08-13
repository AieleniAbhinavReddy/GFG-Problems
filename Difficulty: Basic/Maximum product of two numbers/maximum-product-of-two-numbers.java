
class Solution {
    public static int maxProduct(int[] arr) {
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                smax = max;
                max = num;
            } else if (num > smax && num <= max) {
                smax = num;
            }
        }
        return max*smax;
    }
}
