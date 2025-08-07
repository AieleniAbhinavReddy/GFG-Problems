import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0, sum = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }
            if (sum == target) {
                list.add(start + 1);
                list.add(end + 1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
}
