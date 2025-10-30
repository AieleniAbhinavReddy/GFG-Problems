class Solution {
    public static long sumOfDivisors(long n) {
        long ans=0;
        for(int i=1;i<=n;i++){
            int res=0;
            for(int j=1;j<=i;j++){
                if(i%j==0) res+=j;
            }
            ans+=res;
        }
        return ans;
    }
}