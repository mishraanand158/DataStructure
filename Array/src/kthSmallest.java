import java.io.PrintWriter;
import java.util.Comparator;
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
        PriorityQueue<Integer> maxHeap = new PriorityQueue(new CustomComparator());
        for (int i = l; i <= r; i++) {
            maxHeap.add(arr[i]);  //0 1 2 3 k =3
            if (maxHeap.size() > k)
                maxHeap.poll();
        }
        return maxHeap.peek();
    }
}
/*
        Notes for Comparator Concept  : 7 10 4 20 15
        1.  heap.add(7)         ->   element 7 will add {no comparison required for 1st element }
        2.head.add(10)   ->  (10,7) {after 7 or before 7 you want to add }   let  suppose for max heap means (max will be top)
                            humesha top element ke according dekhna hai phle yaa baad mein ...
                            max wale mein 10 ko 7 ke phle hona hai [10 7 .....like wise max Heap ]
                          Standard:  before means negative
                                     after means Positive
           so heap.add(10) ===  -ve (10,7)    now write compare method (o1,o2)    ->o1-o2  ka result =10-7 = +ve but
                                                            we need -vegaive so  (from o1-o2) (to -{o1-o2})
                                                            change method (01,o2) -=>   -(o1-o2)


 */
class CustomComparator implements Comparator<Integer> {
    @Override                                                    //   7 10 4 20 15
    public int compare(Integer o1, Integer o2) {
        return -(o1 - o2);
    }
}

