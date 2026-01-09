// User function Template for Java
class Solution {
    static int setBits(int n) {
        String s=Integer.toString(n,2);
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='1') count++;
        }
        return count;
    }
}