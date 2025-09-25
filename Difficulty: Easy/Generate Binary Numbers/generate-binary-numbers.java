class Solution {
    public static String getBStr(int n){
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n/=2;
        }
        return sb.reverse().toString();
    }
    public ArrayList<String> generateBinary(int n) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(getBStr(i));
        }
        return list;
    }
}
