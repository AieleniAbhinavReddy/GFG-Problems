class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int n:a) map1.put(n,map1.getOrDefault(n,0)+1);
        for(int n:b) map2.put(n,map2.getOrDefault(n,0)+1);
        for(int n:a){
            if(map1.get(n) != map2.get(n)) return false;
        }
        return true;
    }
}