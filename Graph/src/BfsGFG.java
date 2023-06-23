//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * time complexity is O(n) + O(2E)
 */

class BfsGFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
            Solution1 obj = new Solution1();
            ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution1 {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[] = new boolean[V + 1];

        visited[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        Queue<Integer> qu = new LinkedList<>();
        qu.add(0);


        bfs(0, visited, adj, ls, qu);


        return ls;
    }

    private void bfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls, Queue<Integer> qu) {

        visited[node] = true;
        ls.add(node);

        while (!qu.isEmpty()) {
            int val = qu.poll();

            for (Integer it : adj.get(val)) {
                if (visited[it] == false) {
                    qu.add(it);
                    visited[it] = true;
                    ls.add(it);
                }
            }
        }

    }
}