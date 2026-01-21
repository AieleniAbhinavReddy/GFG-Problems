class Solution {
    public void sort012(int[] arr) {
        int a=0,b=0,c=0;
        for(int n:arr){
            if(n==0) a++;
            if(n==1) b++;
            if(n==2) c++;
        }
        for(int i=0;i<arr.length;i++){
            if(a!=0){
                arr[i]=0;
                a--;
            }else if(b!=0){
                arr[i]=1;
                b--;
            }else{
                arr[i]=2;
                c--;
            }
        }
    }
}