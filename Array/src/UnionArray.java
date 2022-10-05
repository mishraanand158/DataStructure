import java.io.*;
import java.util.*;

//{ Driver Code Starts
//Initial Template for Java
public class UnionArray {

    public static void main(String[] args) {

        //Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        //Taking total count of testcases
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {

            int n, m;

            //taking size of array a
            n = sc.nextInt();

            //taking size of array b
            m = sc.nextInt();

            //Creating 2 array of size n and m
            int a[] = new int[n];
            int b[] = new int[m];

            //inserting elements to array a
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            //inserting elements to array b
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            Solution2 ob = new Solution2();
            //calling doUnion method and printing the results
            System.out.println(ob.doUnion(a, n, b, m));
        }

    }
}
// } Driver Code Ends

//User function Template for Java

class Solution2 {
    public static int doUnion(int a[], int n, int b[], int m) {
        //Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : a)
            map.put(val, 1);
        for (int val : b)
            map.put(val, 1);

        return map.size();
    }
}