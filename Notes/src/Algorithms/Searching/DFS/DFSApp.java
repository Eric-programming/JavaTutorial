package Algorithms.Searching.DFS;

/**
 * In depth-first search (DFS), we explore each branch completely before moving
 * on to the next branch.
 */
public class DFSApp {
    public static void main(String args[]) {
        // Undirectional Graph
        DFS g = new DFS();

        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(4, 1);
        g.addEdge(4, 3);
        g.addEdge(2, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 2);

        System.out.println("Following is Depth First Traversal (starting from vertex 2)");

        g.DFSMethod(2);// start from 2 // 2 1 4 3

        System.out.println("Following is Depth First Traversal with Advanced data (starting from vertex 2)");

        // Advanced Example
        DFS g1 = new DFS();// Undirectional
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

        g1.DFSMethod(2);// 2 1 0 4 3

    }
    // Side note: DFS Search can use Stack instead of recursion.
}