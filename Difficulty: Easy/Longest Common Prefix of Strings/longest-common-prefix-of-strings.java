// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<arr[0].length();i++){
            boolean flag=true;
            for(int j=1;j<arr.length;j++){
                if(arr[0].charAt(i) != arr[j].charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                res.append(arr[0].charAt(i));
            }else{
                break;
            }
        }
        return res.toString();
    }
}