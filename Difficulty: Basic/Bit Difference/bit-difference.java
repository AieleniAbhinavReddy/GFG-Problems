class Solution {
    public static int countBitsFlip(int a, int b) {
        StringBuilder s1=new StringBuilder(Integer.toString(a,2));
        StringBuilder s2=new StringBuilder(Integer.toString(b,2));
        int len=Math.max(s1.length(),s2.length());
        if(s1.length()<len){
            int iter=len-s1.length();
            while(iter-->0){
                s1.insert(0,'0');
            }
        }else{
            int iter=len-s2.length();
            while(iter-->0){
                s2.insert(0,'0');
            }
        }
        int res=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                res++;
            }
        }
        return res;
    }
}
