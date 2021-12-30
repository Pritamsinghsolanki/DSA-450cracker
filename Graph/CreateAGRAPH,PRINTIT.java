package Graph;

class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    @SuppressWarnings("unchecked")
    Graph(int v) {
        V = v;
        adj = new LinkedList[V];
    }

    void Edge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
    }
}
