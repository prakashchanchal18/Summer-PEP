package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class June28_BFSGraph {
    int V;
    int[][] graph;
    June28_BFSGraph(int V) {
        this.V = V;
        graph = new int[V][V];
    }
    void BFS(int start) {
        boolean[] visited = new boolean[V];
        // initialize values of all vertices as F
        for(int i = 0; i < V; i++) {
            visited[i] = false;
        }
        // Queue for initializing the neighbors.
        ArrayList<Integer> a = new ArrayList();
        // add first vertex of Arraylist.
        a.add(start);
        visited[start] = true;
        int current;
        while(!a.isEmpty()) {
            current = a.get(0);
            //print the current value and remove from a
            System.out.print(current + " ");
            a.remove(a.get(0));
            // check for the edges where neighbor exists but not visited.
            for(int i = 0; i < V; i++) {
                if(graph[current][i] == 1 && (!visited[i])) {
                    a.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        June28_BFSGraph g = new June28_BFSGraph(V);
        for(int i = 0; i < V; i++) {
            for(int j = 0; j < V; j++) {
                g.graph[i][j] = sc.nextInt();
            }
        }
        g.BFS(0);
    }
}
