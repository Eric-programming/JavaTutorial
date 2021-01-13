package Algorithms.Searching.GraphSearch;

import java.util.*;

public class BFS {
    public static String bfs(Node source) {
        Queue<Node> q = new LinkedList<>();
        HashSet<Node> hs = new HashSet<>();
        StringBuilder str = new StringBuilder();
        q.add(source);
        while (!q.isEmpty()) {
            Node first = q.poll();
            if (!hs.contains(first)) {
                str.append(first.key);
                hs.add(first);
            }
            for (Node node : first.adjacentsList) {
                if (!hs.contains(node)) {
                    q.add(node);
                }
            }
        }
        return str.toString();

    }
}
