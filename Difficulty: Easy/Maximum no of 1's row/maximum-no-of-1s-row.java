// User function Template for Java

class Sol {
    public static int getIndex(int arr[],int n){
        int l=0,r=n-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(arr[m]==1){
                r=m;
            }else{
                l=m+1;
            }
        }
        return r;
    }
    public static int maxOnes(int Mat[][], int N, int M) {
        int max1=0,res=0;
        for(int i=0;i<N;i++){
            int ind=getIndex(Mat[i],M);
            int c=M-ind;
            if(c>max1){
                res=i;
            }
            max1=Math.max(max1,c);
        }
        return res;
    }
}