class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        int suma=0;
        int maxb=0;
        for(int i=0;i<n;i++){
            suma+=a[i][i];
        }
        for(int i:b){
            if(i>maxb) maxb=i;
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(suma);
        list.add(maxb);
        return list;
    }
}
