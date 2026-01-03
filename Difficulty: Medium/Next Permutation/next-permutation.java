class Solution {
    static void reverse(int[] arr, int s, int e) {
        if (s >= e) return;
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        reverse(arr, s + 1, e - 1);
    }
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int i, j;
        for (i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) break;
        }
        if (i >= 0) {
            for (j = n - 1; j > i; j--) {
                if (arr[j] > arr[i]) break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        reverse(arr, i + 1, n - 1);
    }
}