/*Complete the Function below*/
class Solution {
    static boolean checkPalin(int num){
        String n=Integer.toString(num);
        String revn=new StringBuilder(n).reverse().toString();
        return n.equals(revn);
    }
    public static boolean isPalinArray(int[] arr) {
        boolean flag=true;
        for(int n:arr){
            if(!checkPalin(n)){
                flag=false;
                break;
            }
        }
        return flag;
    }
}