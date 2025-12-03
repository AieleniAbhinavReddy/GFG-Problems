class Solution {
    public int maxWater(int arr[]) {
        int maxW=0,lh=0,rh=0,i=0,j=arr.length-1;
        while(i<j){
            lh=arr[i];
            rh=arr[j];
            int w=Math.min(lh,rh)*(j-i);
            maxW=Math.max(maxW,w);
            if(lh<rh) i++;
            else j--;
        }
        return maxW;
    }
}