

//{ Driver Code Starts

import java.io.*;
import java.util.*;

/**
 * Given an undirected graph with V vertices.
 * We say two vertices u and v belong to a single province if there is a path from u to v or v to u.
 * Your task is to find the number of provinces.
 * Note: A province is a group of directly or indirectly connected cities and no other cities outside of the group.
 */
class Province {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for (int j = 0; j < V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution2 ob = new Solution2();
            System.out.println(ob.numProvinces(adj, V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution2 {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        boolean[] visited = new boolean[V + 1];

        for (int i = 1; i <= V; i++) {

            if (visited[i] == false) {

               // dfs
            }

        }

        return 0;
    }
};
