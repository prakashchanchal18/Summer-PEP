package com.company;
import java.util.Scanner;
public class June28_DFSGraph {
    int V;
    int[][] graph;

    June28_DFSGraph(int V) {
        this.V = V;
        graph = new int[V][V];
    }

    void DFS(int start) {
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++) {
            visited[i] = false;
        }
        DFSUtil(start, visited);
    }

    void DFSUtil(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for(int i = 0; i < V; i++) {
            if(graph[start][i] == 1 && (!visited[i])) {
                DFSUtil(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        June28_DFSGraph g = new June28_DFSGraph(V);
        for(int i = 0; i < V; i++) {
            for(int j = 0; j < V; j++) {
                g.graph[i][j] = sc.nextInt();
            }
        }
        g.DFS(0);
    }
}
