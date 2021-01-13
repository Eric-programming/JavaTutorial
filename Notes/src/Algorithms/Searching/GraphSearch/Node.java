package Algorithms.Searching.GraphSearch;

import java.util.*;

public class Node {
    Character key;
    List<Node> adjacentsList = new LinkedList<>();

    public Node(Character k) {
        key = k;
    }

    public void connect(Node node) {
        adjacentsList.add(node);
    }
}
