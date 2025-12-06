class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int mis=0,dup=0;
        Set<Integer> set=new HashSet<>();
        for(int n:arr){
            if(!set.add(n)){
                dup=n;
                break;
            }
        }
        set=new HashSet<>();
        for(int n:arr){
            set.add(n);
        }
        for(int i=0;i<arr.length;i++){
            if(!set.contains(i+1)){
                mis=i+1;
                break;
            }
        }
        return new ArrayList<>(List.of(dup,mis));
    }
}
