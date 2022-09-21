import java.io.PrintWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); //N = 5
            int arr[] = new int[n]; //arr[] = 7 10 4 20 15      10 , 7,4     20>10 leave , 10 ,7 ,4 then 15>peek leave

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int k = sc.nextInt(); // K = 4
            Solution ob = new Solution();
            out.println(ob.kthSmallest(arr, 0, n - 1, k)); // Output : 15
        }
        out.flush();
    }
}

class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        //default priorityQueue is  min priorityQueue
        PriorityQueue<Integer> maxHeap = new PriorityQueue(k + 1, Collections.reverseOrder());

        for (int i = l; i <= r; i++) {
            maxHeap.add(arr[i]);  //0 1 2 3 k =3
            if (maxHeap.size() > k)
                maxHeap.poll();
        }

        return maxHeap.peek();
    }

}


