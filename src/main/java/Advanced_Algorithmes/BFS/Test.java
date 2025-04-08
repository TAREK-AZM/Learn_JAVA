package Advanced_Algorithmes.BFS;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Create nodes
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");

        // A -> B, C
        nodeA.getChildrens().add(nodeB);
        nodeA.getChildrens().add(nodeE);

        // B -> D
        nodeB.getChildrens().add(nodeD);

        // C -> D
        nodeC.getChildrens().add(nodeD);

        // D -> E
        nodeD.getChildrens().add(nodeC);


        List<Node> graphNodes = new ArrayList<>();
        graphNodes.add(nodeA);



        BFS bfs = new BFS();
        System.out.println("traversez le graphe travers root A:");
        bfs.AlgBfs(graphNodes);
    }
}
