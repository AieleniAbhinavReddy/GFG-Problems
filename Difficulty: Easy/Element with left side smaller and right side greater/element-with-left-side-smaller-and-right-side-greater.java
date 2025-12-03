class Solution {
    public int findElement(int[] arr) {
        for(int i=1;i<arr.length-1;i++){
            boolean lt=true,rt=true;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    lt=false;
                    break;
                }
            }
            if(lt){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<arr[i]){
                        rt=false;
                        break;
                    }
                }
            }
            if(lt && rt) return arr[i];
        }
        return -1;
    }
}
