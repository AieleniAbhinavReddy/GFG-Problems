class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k > arr.length) return 0;
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr ^= arr[i];
        }
        int msf = curr;
        int j = 0;
        for (int i = k; i < arr.length; i++) {
            curr = (curr ^ arr[j]) ^ arr[i];
            msf = Math.max(msf, curr);
            j++;
        }
        return msf;
    }
}
