import java.util.ArrayList;

public class CreateGraph {
    // Class to represent an edge in the graph
    static class Edge {
        int src; // source vertex
        int dst; // destination vertex
        int wt;  // weight of the edge

        // Constructor for the Edge class
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int V = 5; // number of vertices in the graph

        // Initialize an array of ArrayLists to represent the adjacency list of the graph
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>(); // Initialize each ArrayList
        }

        // Adding edges to the graph

        // 0 VERTEX
        graph[0].add(new Edge(0, 1, 5)); // Edge from vertex 0 to vertex 1 with weight 5

        // 1 VERTEX
        graph[1].add(new Edge(1, 0, 5)); // Edge from vertex 1 to vertex 0 with weight 5
        graph[1].add(new Edge(1, 2, 1)); // Edge from vertex 1 to vertex 2 with weight 1
        graph[1].add(new Edge(1, 3, 3)); // Edge from vertex 1 to vertex 3 with weight 3

        // 2 VERTEX
        graph[2].add(new Edge(2, 1, 1)); // Edge from vertex 2 to vertex 1 with weight 1
        graph[2].add(new Edge(2, 3, 1)); // Edge from vertex 2 to vertex 3 with weight 1
        graph[2].add(new Edge(2, 4, 2)); // Edge from vertex 2 to vertex 4 with weight 2

        // 3 VERTEX
        graph[3].add(new Edge(3, 1, 3)); // Edge from vertex 3 to vertex 1 with weight 3
        graph[3].add(new Edge(3, 2, 1)); // Edge from vertex 3 to vertex 2 with weight 1

        // 4 VERTEX
        graph[4].add(new Edge(4, 2, 2)); // Edge from vertex 4 to vertex 2 with weight 2

        // Print all neighbors of vertex 2
        System.out.println("Neighbors of vertex 2:");
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i); // Get the edge from vertex 2 to its neighbor
            System.out.println("2 is connected to " + e.dst + " with weight " + e.wt);
        }
    }
}
