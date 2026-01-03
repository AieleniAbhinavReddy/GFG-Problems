class Solution {
    public static int largest(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){//i=i+1
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
        //Time complexity : O(n)
        //space complexity : O(1)
    }
}
