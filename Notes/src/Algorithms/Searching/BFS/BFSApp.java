package Algorithms.Searching.BFS;

public class BFSApp {
    public static void main(String args[]) {
        BFS g = new BFS();

        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(4, 1);
        g.addEdge(4, 3);
        g.addEdge(2, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 2);

        System.out.println("Following is Breadth First Traversal (starting from vertex 2)");

        g.BFSMethod(2);// 2 1 3 4

        System.out.println("Following is Breadth First Traversal Advanced (starting from vertex 2)");

        // Advanced Example
        BFS g1 = new BFS();// Undirectional
        g1.addEdge(0, 1);
        g1.addEdge(0, 4);
        g1.addEdge(4, 1);
        g1.addEdge(4, 0);
        g1.addEdge(4, 3);
        g1.addEdge(3, 1);
        g1.addEdge(3, 4);
        g1.addEdge(3, 2);
        g1.addEdge(2, 1);
        g1.addEdge(2, 3);
        g1.addEdge(1, 0);
        g1.addEdge(1, 4);
        g1.addEdge(1, 3);
        g1.addEdge(1, 2);

        g1.BFSMethod(2);// 2 1 3 0 4

    }
}