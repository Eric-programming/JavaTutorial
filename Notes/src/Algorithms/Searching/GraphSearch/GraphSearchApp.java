package Algorithms.Searching.GraphSearch;

public class GraphSearchApp {
    private static Node init() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        A.connect(B);
        A.connect(D);
        B.connect(A);
        B.connect(D);
        B.connect(C);
        D.connect(A);
        D.connect(B);
        D.connect(E);
        C.connect(B);
        C.connect(E);
        E.connect(C);
        E.connect(D);
        return A;
    }

    public static void main(String[] args) {
        Node Source = init();
        String dfsString = DFS.dfs(Source);
        System.out.println(dfsString);

        String bfsString = BFS.bfs(Source);
        System.out.println(bfsString);
    }
}
