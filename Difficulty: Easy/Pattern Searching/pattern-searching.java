// User function Template for Java

class Solution {
    int search(String text, String pat) {
        int n=text.length(),m=pat.length();
        for(int i=0;i<=n-m;i++){
            int j=0;
            while(j<m && text.charAt(i+j)==pat.charAt(j)){
                j++;
            }
            if(j==m) return 1;
        }
        return 0;
    }
};