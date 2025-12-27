class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int[] arr=new int[10001];
        for(int[] i:mat){
            for(int num:i){
                arr[num]++;
            }
        }
        int i=1;
        while(i<10000){
            if(arr[i]!=0){
                arr[i]-=1;
                k--;
                if(k==0) return i;
            }else{
                i++;
            }
        }
        return -1;
    }
}
