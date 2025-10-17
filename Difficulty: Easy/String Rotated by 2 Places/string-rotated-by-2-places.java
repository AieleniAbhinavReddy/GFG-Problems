class Solution {
    public static boolean isRotated(String s1, String s2) {
        if(s1.length()==1) return s1.equals(s2);
        int n=s1.length();
        String sl=s1.substring(2,n)+s1.substring(0,2);
        String sr=s1.substring(n-2)+s1.substring(0,n-2);
        // System.out.println(sl+" "+sr);
        return sl.equals(s2) || sr.equals(s2);
    }
}