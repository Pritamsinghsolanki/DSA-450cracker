package Graph;

import java.util.Queue;

class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    Boolean isCycleUtil(int v, Boolean[] visited, int parent) {
        visited[v] = true;
        Iterator<Integer> itr = adj[v].iterator();
        while (itr.hasNext()) {
            int n = itr.next();
            /// if adjacent is not visited then recur for that
            if (!visited[n]) {
                if (isCycleUtil(n, visited, parent))
                    return true;
            } else if (n != parent) {
                return true;
            }
        }
        return false;
    }

    Boolean isCyclic() {
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        for (int u = 0; u < V; u++) {
            if (!visited[u]) {
                if (isCycleUtil(u, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    class Graph {
        int V, E;
        Edge edge[];

        class Edge {
            int src, des;
        }

        Graph(int v, int e) {
            V = v;
            E = e;
            edge = new Edge[E];
            for (int i = 0; i < e; i++) {
                edge[i] = new Edge();
            }
        }

        int find(int parent[], int i) {
            if (parent[i] == -1)
                return i;
            return find(parent, parent[i]);
        }

        void union(int[] parent, int x, int y) {
            parent[x] = y;
        }

        int isCyclic(Graph graph) {
            int[] parent = new int[graph.V];
            for (int i = 0; i < graph.V; i++) {
                parent[i] = -1;
            }
            for (int i = 0; i < graph.E; i++) {
                int x = graph.find(parent, graph.edge[i].src);
                int y = graph.find(parent, graph.edge[i].dest);
                if (x == y)
                    return 1;
                graph.union(parent, x, y);
            }
            return 0;
        }

        public static void main(String[] args){
            int V=3;
            int E=4;
            Graph graph=new Graph(V,E);
            graph.edge[0].src=0;
            graph.edge[0].dest=1;

            graph.edge[1].src=1;
            graph.edge[1].dest=2;


            if(graph.isCyclic(graph)==1){
                System.out.println('Cycle exixt');
            }else{
                System.out.println("Cycle not exist");
            }
        }
    }

}

    // BFS
    static boolean isCyclicconnected(ArrayList<Integer> adj[], int s, int V, boolean[] visited) {
        int parent[] = new int[V];
        Arrays.fill(parent, -1);
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int n = q.poll();
            Iterator<Integer> lt = adj[n].iterator();
            for (int itr : lt) {
                if (!visited[itr]) {
                    q.add(itr);
                    visited[itr] = true;
                    parent[itr] = u;
                } else if (parent[n] != itr) {
                    return true;
                }
            }
            return false;
        }
    }

}