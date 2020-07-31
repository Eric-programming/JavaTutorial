package DataStructure.Graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Vertex and Edges
public class GraphClass<T> {
    private Map<T, List<T>> map;
    private boolean undirectional;

    public GraphClass(boolean isUndirectional) {
        super();
        map = new HashMap<>();
        undirectional = isUndirectional;
    }

    public void addVertex(T v) {
        map.put(v, new LinkedList<T>());
    }

    public void addEdge(T start, T end) {
        if (!hasVertex(start)) {
            addVertex(start);
        }
        if (!hasVertex(end)) {
            addVertex(end);
        }
        map.get(start).add(end);
        // Undirectional means 2 ways
        if (undirectional) {
            map.get(end).add(start);
        }
    }

    // Connection between two vertex = one edge
    public int getEdgesCount() {
        int count = 0;
        for (T e : map.keySet()) {
            count += map.get(e).size();
        }
        // Filter duplicates to get the counts
        if (undirectional) {
            count /= 2;
        }
        return count;
    }

    public boolean hasVertex(T v) {
        return map.containsKey(v);
    }

    public boolean hasEdge(T start, T end) {
        return map.get(start).contains(end);
    }

    public void printGraph() {
        System.out.println(map);
    }

}