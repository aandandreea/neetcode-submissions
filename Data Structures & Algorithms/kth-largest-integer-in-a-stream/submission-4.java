class KthLargest {
    PriorityQueue<Integer> queue;
    int K;

    public KthLargest(int k, int[] nums) {
        K = k;
        queue = new PriorityQueue<>();

        for (int num : nums) {
            queue.offer(num);

            if (queue.size() > k) {
                queue.poll();
            }
        }
    }

    public int add(int val) {
        queue.offer(val);
        if (queue.size() > K) {
            queue.poll();
        }
        return queue.peek();
    }
}
