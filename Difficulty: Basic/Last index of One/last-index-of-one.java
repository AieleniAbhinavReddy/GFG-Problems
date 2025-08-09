// User function Template for Java

class Solution {
    public int lastIndex(String s) {
        int res=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') res=i;
        }
        return res;
    }
}