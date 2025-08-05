class Solution {
    static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public void reverseInGroups(int[] arr, int k) {
        int currs=0,curre=k-1;
        while(curre<arr.length){
            reverse(arr,currs,curre);
            currs+=k;
            curre+=k;
        }
        reverse(arr,currs,arr.length-1);
    }
}