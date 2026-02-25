class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        int sum=0;
        int l=0;
        int res=Integer.MAX_VALUE;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            while(sum>x){
                res=Math.min(res,r-l+1);
                sum-=arr[l];
                l++;
            }
        }
        if(res==Integer.MAX_VALUE) return 0;
        return res;
    }
}
