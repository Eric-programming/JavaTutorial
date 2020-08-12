package InterviewQA.Tree;

import java.util.*;

import DataStructure.Graphs.GraphClass;

/**
 * Route Between Nodes: Given a directed graph, design an algorithm to find out
 * whether there is a route between two nodes.
 */
public class RouteBetweenNodes {
    private static class GraphClassDemo<T> extends GraphClass<T> {

        public GraphClassDemo(boolean isUndirectional) {
            super(isUndirectional);
        }

        private boolean findRouteBetweenNodes(Set<T> visited, Queue<T> storage, T source, T destination) {
            visited.add(source);

            List<T> list = map.get(source);

            for (T item : list) {
                if (destination == item) {
                    return true;
                }
                if (visited.contains(item) == false) {
                    visited.add(item);
                    storage.add(item);
                }
            }

            while (storage.isEmpty() == false) {
                return findRouteBetweenNodes(visited, storage, storage.poll(), destination);
            }
            return false;
        }

        public void RouteBetweenNodesMethod(T source, T destination) {
            HashSet<T> visited = new HashSet<>();

            Queue<T> storage = new LinkedList<>();

            boolean result = findRouteBetweenNodes(visited, storage, source, destination);

            System.out.println(
                    source + " to " + destination + (result == true ? " has a path " : " doesn't have a path "));
        }

    }

    public static void main(String[] args) {

        // false = directional and true= undirectional
        GraphClassDemo<Character> graph = new GraphClassDemo<>(false);

        graph.addEdge('A', 'B');
        graph.addEdge('B', 'C');
        graph.addEdge('C', 'E');
        graph.addEdge('E', 'F');
        graph.addEdge('E', 'D');
        graph.addEdge('D', 'B');

        graph.printGraph();

        // A->F (TRUE)
        graph.RouteBetweenNodesMethod('A', 'F');
        // B->D (TRUE)
        graph.RouteBetweenNodesMethod('B', 'D');
        // B->B (TRUE)
        graph.RouteBetweenNodesMethod('B', 'B');
        // A->A (FALSE)
        graph.RouteBetweenNodesMethod('A', 'A');
        // C->Q (FALSE)
        graph.RouteBetweenNodesMethod('C', 'Q');

    }

}