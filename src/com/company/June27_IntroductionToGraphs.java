package com.company;

// Graphs - It is a non-linear data structure
// which is formed from a finite set of vertices (V) and a finite set of edges (E).

// NOTE - Every tree possible is a possible graph but, every possible graph is not a possible tree.

// Types of graph -
// 1. Cyclic Graph - A graph G which contains a cycle formation are called as a cyclic graph.
// 2. Non-Cyclic Graph - A graph G which does not contain any cycle formation is called a non-cyclic graph.
// 3. Directed Graph/Dgraph - There exists an edge from vertex A to B but no edge from B to A.
// 4. Non-Directed Graph - A graph is said to be non-directed or non-digraph
//                         if there exists an edge from A to B then there exists an edge from B to A also.
// 5. Weighted Graph -

// Adjacency matrix - A matrix to represent graph input.
// Contain self-loop or not - check for a diagonal element if any diagonal element has 1 graph have a self-loop.
// Number of edges = count the entries where values are one and divide it by 2.
import java.util.*;
public class June27_IntroductionToGraphs {
    // Data
    int V;
    int[][] graph = new int[V][V];
    June27_IntroductionToGraphs(int vertices) {
        this.V = vertices;
        this.graph = new int[V][V];
    }

    public void display() {
        for(int i = 0; i < V; i++) {
            for(int j = 0; j < V; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getEdges() {
        int count = 0;
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (graph[i][j] == 1) {
                    count++;
                }
            }
        }
        return count/2;
    }

    public boolean containsSelfLoop() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if(i == j) {
                    if(graph[i][j] == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        June27_IntroductionToGraphs g = new June27_IntroductionToGraphs(V); // Vertices = 6
        for(int i = 0; i < g.V; i++) {
            for(int j = 0; j < g.V; j++) {
                g.graph[i][j] = sc.nextInt();
            }
        }
        g.display();
        System.out.println("Total number of the edges in the graph - " + g.getEdges());
        System.out.println("Graph contains a self loop - " + g.containsSelfLoop());

    }
}
