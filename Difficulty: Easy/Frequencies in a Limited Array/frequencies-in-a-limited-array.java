class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        //int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
            //if(max<n) max=n;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=arr.length;i++){
            if(map.containsKey(i)) list.add(map.get(i));
            else list.add(0);
        }
        return list;
    }
}
