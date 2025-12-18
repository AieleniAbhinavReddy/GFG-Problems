class Solution {
    int minDist(int arr[], int x, int y) {
        int last_x = -1;
        int last_y = -1;
        int min_dist = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                last_x = i;
            }
            if (arr[i] == y) {
                last_y = i;
            }
            if (last_x != -1 && last_y != -1) {
                min_dist = Math.min(min_dist, Math.abs(last_x - last_y));
            }
        }
        return (min_dist == Integer.MAX_VALUE) ? -1 : min_dist;
    }
}