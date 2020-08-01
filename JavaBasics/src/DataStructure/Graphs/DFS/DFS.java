package DataStructure.Graphs.DFS;

import java.util.*;

/**
 * Traversing Graph using Depth First Search
 * 
 * Backtracking = trace one step back
 */
public class DFS {

    private Map<Integer, List<Integer>> map;

    // Constructor
    public DFS() {
        map = new HashMap<>();
    }

    public void addEdge(int source, int destination) {
        if (map.get(source) == null) {
            map.put(source, new LinkedList<Integer>());// empty linkedlist
        }
        map.get(source).add(destination);
    }

    public void DFSRecur(int source, Set<Integer> visited) {
        // Mark the current node as visited and print it
        visited.add(source);
        System.out.println(source);

        // Use recursion to get all vertices adjacents to this current vertex
        Iterator<Integer> i = map.get(source).listIterator();
        while (i.hasNext()) {
            int nextVertex = i.next();
            if (!visited.contains(nextVertex))
                DFSRecur(nextVertex, visited);// Visit n and n's children.
        }
    }

    public void DFSMethod(int source) {
        Set<Integer> visited = new HashSet<>();
        // Traverse the graph
        DFSRecur(source, visited);
    }
}