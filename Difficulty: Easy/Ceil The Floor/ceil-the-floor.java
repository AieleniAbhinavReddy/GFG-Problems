// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int ceil=Integer.MAX_VALUE,floor=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ceil && arr[i]>=x){
                ceil=arr[i];
            }
            if(arr[i]>floor && arr[i]<=x){
                floor=arr[i];
            }
        }
        int[] res=new int[2];
        if(floor==Integer.MIN_VALUE) res[0]=-1;
        else res[0]=floor;
        if(ceil==Integer.MAX_VALUE) res[1]=-1;
        else res[1]=ceil;
        return res;
    }
}
