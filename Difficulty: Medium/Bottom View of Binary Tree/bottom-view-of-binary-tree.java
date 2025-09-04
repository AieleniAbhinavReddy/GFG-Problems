class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Node> queue = new LinkedList<>();

        // set hd of root = 0
        root.hd = 0;
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            int hd = temp.hd;

            // always overwrite → ensures bottom-most node stays
            map.put(hd, temp.data);

            if (temp.left != null) {
                temp.left.hd = hd - 1;
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                temp.right.hd = hd + 1;
                queue.offer(temp.right);
            }
        }

        // collect values in sorted order of hd
        for (int val : map.values()) {
            list.add(val);
        }
        return list;
    }
}
