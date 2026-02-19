// User function Template for Java

class Solution {
    int middle(int a, int b, int c) {
        int min=Math.min(a,Math.min(b,c));
        int max=Math.max(a,Math.max(b,c));
        if(a!=min && a!=max) return a;
        else if(b!=min && b!=max) return b;
        else return c;
    }
}