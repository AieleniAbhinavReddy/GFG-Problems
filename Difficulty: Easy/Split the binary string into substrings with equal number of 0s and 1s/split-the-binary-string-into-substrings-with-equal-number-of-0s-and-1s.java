// User function Template for Java

class Solution {
    public static int maxSubStr(String str) {
        int c0=0,c1=0,res=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0') c0++;
            else c1++;
            if(c0==c1) res++;
        }
        if(c0 != c1) return -1;
        return res;
    }
}