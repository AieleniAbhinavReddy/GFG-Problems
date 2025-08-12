class Solution {
    public static int chocolates(int n, int[] arr) {
        int min=arr[0];
        for(int num:arr){
            if(num<min) min=num;
        }
        return min;
    }
}
