class Solution {
    public int kthElement(int a[], int b[], int k) {
        int i=0,j=0,res=-1;
        while(k>0 && i<a.length && j<b.length){
            if(a[i]<b[j]){
                res=a[i];
                i++;
            }else{
                res=b[j];
                j++;
            }
            k--;
        }
        while(k>1 && i<a.length){
            res=a[i++];
            i++;
            k--;
        }
        while(k>1 && j<b.length){
            res=b[j];
            j++;
            k--;
        }
        if(i<a.length || j<b.length){
            if(i>=a.length) res=b[j];
            else if(j>=b.length) res=a[i];
        }
        return res;
    }
}