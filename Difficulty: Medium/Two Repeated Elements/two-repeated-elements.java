class Solution {
    public int[] twoRepeated(int[] arr) {
        int i=0,j=0;
        int a=-1,b=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==2){
                if(a==-1){
                    a=e.getKey();
                }
                else{
                    b=e.getKey();
                    break;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]==a) i=k;
            if(arr[k]==b) j=k;
        }
        int[] res=new int[2];
        if(i<j){
            res[0]=a;
            res[1]=b;
        }else{
            res[0]=b;
            res[1]=a;
        }
        return res;
    }
}