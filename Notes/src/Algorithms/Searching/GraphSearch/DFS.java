package Algorithms.Searching.GraphSearch;

import java.util.*;

public class DFS {
    static String dfs(Node source) {
        StringBuilder str = new StringBuilder();
        HashSet<Node> hs = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        stack.add(source);
        while (!stack.isEmpty()) {
            Node top = stack.pop();
            if (!hs.contains(top)) {
                str.append(top.key);
                hs.add(top);
            }
            for (Node node : top.adjacentsList) {
                if (hs.contains(node) == false) {
                    stack.add(node);
                }
            }
        }
        return str.toString();
    }
}
