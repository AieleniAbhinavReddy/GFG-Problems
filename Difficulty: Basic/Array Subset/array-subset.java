
class Solution {
    public static int findEle(int[] a,int t){
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
                a[i]=-1;
                return i;
            }
        }
        return -1;
    }
    public boolean isSubset(int a[], int b[]) {
        for(int n:b){
            int i=findEle(a,n);
            if(i==-1) return false;
        }
        return true;
    }
}
