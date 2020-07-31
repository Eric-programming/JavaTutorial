package DataStructure.Graphs.BFS;

import java.util.*;

public class BFS {

    private Map<Integer, List<Integer>> map;

    // Constructor
    public BFS() {
        map = new HashMap<>();
    }

    public void addEdge(int source, int destination) {
        if (map.get(source) == null) {
            map.put(source, new LinkedList<Integer>());// empty linkedlist
        }
        map.get(source).add(destination);
    }

    public void BFSRecur(int source, Set<Integer> visited, Queue<Integer> storage) {
        // Mark the current node as visited and print it
        visited.add(source);
        System.out.println(source);

        // Loop through them and then we look at their children
        Iterator<Integer> i = map.get(source).listIterator();
        while (i.hasNext()) {
            int nextVertex = i.next();
            if (!visited.contains(nextVertex)) {
                visited.add(nextVertex);
                storage.add(nextVertex);
            }
        }
        while (storage.isEmpty() == false) {
            BFSRecur(storage.poll(), visited, storage);
        }

    }

    public void BFSMethod(int source) {
        Queue<Integer> storage = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        // Traverse the graph
        BFSRecur(source, visited, storage);
    }
}