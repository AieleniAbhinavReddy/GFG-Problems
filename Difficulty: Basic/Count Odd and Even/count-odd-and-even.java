class Solution {
    public int[] countOddEven(int[] arr) {
        int ce=0,co=0;
        for(int n:arr){
            if(n%2==0) ce++;
            else co++;
        }
        int[] res={co,ce};
        return res;
    }
}