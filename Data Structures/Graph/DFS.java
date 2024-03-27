import java.util.LinkedList;
import java.util.Queue;

public class DFS {

    public static String bfs(Graph g) {
        String result = "";
        Queue<Integer> queue = new LinkedList<>();
        int visited[] = new int[g.getVertices()];

        System.out.println("Vertices count: "+ g.getVertices());
        // Write - Your - Code

        return result;
    }

    public static void main(String[] args) {

        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        String res = bfs(g);
    }

}
