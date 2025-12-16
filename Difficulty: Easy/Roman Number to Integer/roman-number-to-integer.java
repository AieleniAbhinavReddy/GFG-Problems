class Solution {
    public int romanToDecimal(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length(),res=0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<n;i++){
            if(i+1<n && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                res+=map.get(s.charAt(i+1))-map.get(s.charAt(i));
                i++;
            }else{
                res+=map.get(s.charAt(i));
            }
        }
        return res;
    }
}