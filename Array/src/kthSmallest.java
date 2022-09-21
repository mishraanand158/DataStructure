import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); //N = 5
            int arr[] = new int[n]; //arr[] = 7 10 4 20 15
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

        PriorityQueue<Integer> priorityQueue = new PriorityQueue(k);
        for(int i=l;i<k;i++)
            priorityQueue.add(arr[l]);

        for (int j= k;j<r;j++){

        }


        return 1;
    }
}


