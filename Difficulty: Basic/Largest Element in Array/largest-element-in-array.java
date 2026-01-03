class Solution {
    public static int largest(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
}