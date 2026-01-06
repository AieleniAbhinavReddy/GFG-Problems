// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        StringBuilder str=new StringBuilder(s);
        str=str.reverse();
        return str.toString();
    }
}

/*
Approach :
we use string and stringbuilder inbuilt methods
reverse(), toString() methods 
*/