class Solution {
    public void sort012(int[] arr) {
        int c1=0,c2=0,c3=0;
        for(int n:arr){
            if(n==0) c1++;
            if(n==1) c2++;
            if(n==2) c3++;
        }
        for(int i=0;i<arr.length;i++){
            if(c1>0){
                arr[i]=0;
                c1--;
            }else if(c2>0){
                arr[i]=1;
                c2--;
            }else{
                arr[i]=2;
                c3--;
            }
        }
    }
}