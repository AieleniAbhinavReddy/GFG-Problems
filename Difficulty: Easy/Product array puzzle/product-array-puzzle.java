class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int[] res = new int[n];
        //for prefix product
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }
        //for suffix product
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= arr[i];
        }

        return res;
    }
}
