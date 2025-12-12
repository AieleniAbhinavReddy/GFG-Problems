class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        ArrayList<ArrayList<Integer>> m=new ArrayList<>();
        for(int j=0;j<mat.length;j++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<mat[0].length;i++){
                list.add(mat[i][j]);
            }
            m.add(list);
        }
        return m;
    }
}