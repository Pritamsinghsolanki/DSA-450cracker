package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Graph {
    private final int V;
    private final List<List<Integer>> adj;

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new LinkedList<>());
        }
    }

    private boolean isCyclicDFS(int i,boolean[] visited,boolean[] recStack){
        if(recStack[i]]==true) return true;
        if(visited[i]==true) return false;

        visited[i]=true;
        recStack[i]=true;
        List<Integer> child=adj.get(i);
        for(Integer c: child){
            if(isCyclicDFS(c,visited,recStack)){
                return true;
            }
        }
        recStack[i]=false;
        return false;
    }

    // using colors
    static int WHITE = 0, GRAY = 1, BLACK = 2;

    static boolean DFSUTIL(Graph g, int u, int[] color) {
        color[u] = GRAY;
        for (Integer in : g.adj[u]) {
            if (color[in] == GRAY)
                return true;
            if (color[in] == WHITE && DFS(g, in, color))
                return true;
        }
        color[u] = BLACK;
        return false;
    }

    // BFS
    boolean isCycle() {
        int[] in_degree = new int[this.V];
        Arrays.fill(in_degree, 0);

        for (int u = 0; u < V; u++) {
            for (int v : adj[u]) {
                in_degree[v]++;
            }
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < V; i++) {
            if (in_degree[i] == 0)
                q.add(i);
        }
        int count = 0;
        Vector<Integer> top_order = new Vector<>();
        while (!q.isEmpty()) {
            int u = q.poll();
            top_order.add(u);
            for (int itr : adj[u]) {
                if (--in_degree[itr] == 0) {
                    q.add(itr);
                }
            }
            cnt++;
        }
        if (cnt != this.V) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args){
        Graph g=new Graph(6);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,0);

        if(g.isCycle()){
            System.out.println("YES");
        }else{
            System.out.println('NO');
        }
    }

}}
