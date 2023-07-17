package com.company;
import java.util.Scanner;

// PRIME'S Algorithm: - Help you generate a minimal spanning tree (MST) for a given graph G.
public class June30_PrimsAlgorithmMST {
    int V;
    int[][] graph;
    June30_PrimsAlgorithmMST(int V) {
        this.V = V;
        graph = new int[V][V];
    }
    // Algorithm:
    public void primsAlgo(int[][] graph) {
        // Step 1. Create a track of all the visited vertices of the graph (boolean[] visited = new boolean[]).
        boolean[] visited = new boolean[V];
        // Step 2. Create a track of min cost for reaching vertex V.
        int[] cost = new int[V];
        for(int i = 0; i < V; i++) {
            visited[i] = false;
            cost[i] = Integer.MAX_VALUE;
        }
        // Step 3. Make a start/entry point of the graph.
        cost[0] = graph[0][0];
        for(int i = 0; i < V; i++) {
            // minCostVertex is a function which gives the value of the vertex
            // which has not been visited and have the least value.
            int u = 0;
            //int u = minCostVertex(cost, visited);
            visited[u] = true;
            // I am looking for all the neighbor of u.
            for(int v=0; v<u; v++) {
                // if there is an edge between u and v and not visited and cost should be minimum.
                if(graph[u][v] != 0 && !visited[v] && graph[u][v] < cost[v]) {
                    cost[v] = graph[u][v];
                }
            }
        }

    }
    // create a display which is going to build the MST.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        June30_PrimsAlgorithmMST mst = new June30_PrimsAlgorithmMST(V);
        // input of graph
        for(int i = 0; i < mst.V; i++) {
            for(int j = 0; j < mst.V; j++) {
                mst.graph[i][j] = sc.nextInt();
            }
        }
    }
}
