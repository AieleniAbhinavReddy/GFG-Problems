/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        int i;
        for(i=0;i<b.length;i++){
            if(a[i] != b[i]) return i;
        }
        if(i==b.length) return i;
        return -1;
    }
}