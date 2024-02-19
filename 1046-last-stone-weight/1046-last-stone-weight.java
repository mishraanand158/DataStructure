class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // by default MinHeap is there

            for (int val : stones) {
                pq.add(val);
            }

            while (pq.size() > 1) {

                int peek1 = pq.remove();
                int peek2 = pq.remove();
                pq.add(peek1 - peek2);

            }

            pq.peek();
            return pq.peek();
    }
}