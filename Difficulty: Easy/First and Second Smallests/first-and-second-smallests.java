class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        if(arr.length<2){
            list.add(-1);
            return list;
        }
        int ss=1000000,s=1000000;
        for(int n:arr){
            if(n<s){
                ss=s;
                s=n;
            }
            if(n>s && n<ss){
                ss=n;
            }
        }
        if(s==1000000 || ss==1000000){
            list.add(-1);
            return list;
        }
        list.add(s);
        list.add(ss);
        return list;
    }
}
