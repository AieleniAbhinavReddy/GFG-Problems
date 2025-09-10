
class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        ArrayList<Integer> list=new ArrayList<>();
        int steps=0;
        int i=0;
        while(i<arr.length){
            if(i==arr.length-1){
                if(arr[i]>arr[i-1]){
                    // steps++;
                    list.add(steps);
                }
                break;
            }else if(arr[i]>=arr[i+1]){
                list.add(steps);
                steps=0;
                i++;
            }else{
                steps++;
                i++;
            }
        }
        int maxSteps=0;
        for(int n:list) maxSteps=Math.max(maxSteps,n);
        return maxSteps;
    }
}