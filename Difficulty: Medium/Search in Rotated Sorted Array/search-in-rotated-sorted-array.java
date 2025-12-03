class Solution {
    int search(int[] arr, int key) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == key) {
                return m;
            }
            if (arr[l] <= arr[m]) { 
                if (arr[l] <= key && key < arr[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } 
            else { 
                if (arr[m] < key && key <= arr[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return -1;
    }
}