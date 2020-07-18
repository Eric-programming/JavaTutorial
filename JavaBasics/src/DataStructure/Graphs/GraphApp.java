package DataStructure.Graphs;

public class GraphApp {
    public static void main(String[] args) {
        long[] arr = new long[] { 1, 2, 3, 4, 5, 6 };
        implementGraph(arr);
    }

    public static void implementGraph(long[] arr) {
        // Refer to image graph3.png
        GraphClass<Long> g = new GraphClass<>(true);// try false
        for (int i = 0; i < arr.length - 1; i++) {
            g.addEdge(arr[i], arr[i + 1]);
        }
        g.printGraph();
    }
}