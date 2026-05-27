class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        // [2,2,3,4,6]
        // [2,2,2,3]
        // [1,2,2]
        // [1]
        // [-6,-4,-3,-2,-2]
        for(int i : stones){
            heap.offer(-i);
        }
        while(heap.size() > 1){
            int a = heap.poll();
            int b = heap.poll();
            if(a != b){
                int diff = a - b;
                heap.offer(diff);
            }
        }
        if(heap.size() == 0){
            return 0;
        } 
        return Math.abs(heap.peek());
    
    }
}
