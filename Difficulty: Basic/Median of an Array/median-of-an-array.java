class Solution {
    public double findMedian(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        double res=0.0;
        int i=n/2;
        if(n%2==0){
            res=(arr[i-1]+arr[i])/2.0;
        }else{
            res=arr[i];
        }
        return res;
    }
}
