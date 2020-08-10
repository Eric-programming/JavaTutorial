package DataStructure.Graphs;

/**
 * Graph is a data structure that contains a list of nodes or vertex that
 * connected by edges
 * 
 * Adjacency List: Every nodes stores a list of adjacent nodes.
 * 
 * Ajancency Matrix: (number of nodes)*(number of nodes) matrix boolean or 2d
 * boolean array
 */
public class GraphApp {
    public static void main(String[] args) {
        long[] arr = new long[] { 1, 2, 3, 4, 5, 6 };
        implementGraph(arr);
    }

    public static void implementGraph(long[] arr) {
        GraphClass<Long> g = new GraphClass<>(false);// try false
        for (int i = 0; i < arr.length - 1; i++) {
            g.addEdge(arr[i], arr[i + 1]);
        }
        g.printGraph();

        System.out.println(g.getEdgesCount());
    }
}