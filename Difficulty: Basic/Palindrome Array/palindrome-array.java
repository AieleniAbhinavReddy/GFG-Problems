
class Solution {
    public static boolean isPerfect(int[] arr) {
        int l=0,r=arr.length-1;
        boolean flag= true;
        while(l<r){
            if(arr[l++] != arr[r--]){
                flag=false;
                break;
            }
        }
        return flag ;
    }
}
