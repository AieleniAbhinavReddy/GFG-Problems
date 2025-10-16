class Solution {
    static List<Integer> get(int a, int b) {
        a=a-b;
        b=a+b;
        a=b-a;
        List<Integer> swap = new ArrayList<>();
        swap.add(a);
        swap.add(b);
        return swap;
    }
}