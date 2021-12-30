package Graph;

import java.util.*;
import java.io.*;

class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    @SuppressWarnings("unChecked")
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFS(n, visited);
            }
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[v];
        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.DFS(2);
    }
}