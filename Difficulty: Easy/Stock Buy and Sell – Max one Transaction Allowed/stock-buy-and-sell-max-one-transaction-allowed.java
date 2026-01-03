// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        int res=0;
        int minp=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>minp){
                res=Math.max(res,(prices[i]-minp));
            }else{
                minp=prices[i];
            }
        }
        return res;
    }
}