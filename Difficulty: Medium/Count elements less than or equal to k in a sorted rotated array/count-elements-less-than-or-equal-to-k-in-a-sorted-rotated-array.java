class Solution {
    public int countLessEqual(int[] arr, int x) {
        int c=0;
        for(int n:arr){
            if(x>=n) c++;
        }
        return c;
    }
}
