class Solution {
    boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
            char st=s.charAt(l++);
            char en=s.charAt(r--);
            if(st != en) return false;
        }
        return true;
    }
}