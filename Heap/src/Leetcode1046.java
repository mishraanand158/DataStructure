import java.util.Collections;
import java.util.PriorityQueue;

public class Leetcode1046 {

    /**
     * You are given an array of integers stones where stones[i] is the weight of the ith stone.
     * We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
     * If x == y, both stones are destroyed, and
     * If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
     * At the end of the game, there is at most one stone left.
     * Return the weight of the last remaining stone. If there are no stones left, return 0.
     */

    public static void main(String[] args) {
        Solution s1 = new Solution();

        int[] stones = {2, 7, 4, 1, 8, 1};

        s1.lastStoneWeight(stones);
    }


    static class Solution {
        public int lastStoneWeight(int[] stones) {

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // by default MinHeap is there

            for (int val : stones) {
                pq.add(val);
            }

            while (pq.size() > 1) {

                int peek1 = pq.remove();


                int peek2 = pq.remove();
                System.out.println("peek1 = " + peek1 + " " + peek2 + "result 2 = " + (peek1 - peek2));
                pq.add(peek1 - peek2);

            }

            pq.peek();
            return pq.peek();
        }
    }
}
