import java.util.*;
public class bipartite_graph{
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));
    }

    public static boolean isBipartite(ArrayList<Edge> graph[]){
        int col[] = new int[graph.length];
        for(int i=0; i<col.length; i++){
            col[i]=-1;   // -1 mean sari node ko initially koi color assign nahi kiya hai
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<graph.length; i++){
            if(col[i]==-1){
                q.add(i);
                col[i]=0; // 0 let say pink color
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);  // neighbour is e.dest
                        if(col[e.dest]==-1){      // neighbour ke pass color nahi hai so ham usse hamare se opposite coloe assign karenge
                            int nextCol = col[curr]==0 ? 1 : 0;
                            col[e.dest]=nextCol;
                            q.add(e.dest);
                        }
                        else if(col[e.dest]==col[curr]){   // neighbour ke pass color hai and same hai mean bipartite graph nahi hoga
                            return false;  // not bipartite graph
                        }
                    }
                }
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        int V=5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        System.out.println(isBipartite(graph));
    }
}