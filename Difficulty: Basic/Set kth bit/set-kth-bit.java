// User function Template for Java
class Solution {
    static int setKthBit(int n, int k) {
        StringBuilder sb=new StringBuilder(Integer.toString(n,2));
        int len=sb.length();
        sb.setCharAt((len-k-1),'1');
        return Integer.parseInt(sb.toString(),2);
        
    }
}