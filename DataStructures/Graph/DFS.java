import java.util.LinkedList;
import java.util.Queue;

public class DFS {

    public static String bfs(Graph g) {
        String result = "";
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[g.getVertices()];
        visited[0] = true;
        queue.add(0);
        while (!queue.isEmpty()){
            int curr = queue.poll();
            result += Integer.toString(curr);
            LinkedList<Integer> temp = g.getAdjacencyList()[curr];
            for (Integer num:temp){
                if(!visited[num]){
                    queue.add(num);
                    visited[num]=true;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        String res = bfs(g);
        System.out.println("Result:"+res);
    }

}
