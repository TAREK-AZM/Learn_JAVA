package Advanced_Algorithmes.BFS;

import java.util.*;

public class BFS {



    public  void AlgBfs ( List<Node> graphe){
        //    BFS(Graph, start):
        //  1. Créer une file d'attente vide Q
        Queue<Node> Q = new ArrayDeque<>();

        //  2. Créer un ensemble ou une liste pour stocker les nœuds visités (Visité)
        List<Node> nodesVisite = new ArrayList<>();

        // 3. Enfiler le nœud de départ dans Q
        Q.add(graphe.get(0));

        // 4. Ajouter le nœud de départ à Visité
        nodesVisite.add(graphe.get(0));
        // 5. Tant que Q n'est pas vide :

        while (!Q.isEmpty()){
            Node Current_Node = Q.poll();
            System.out.println("visite: " + Current_Node.getValue());

            for(Node n : Current_Node.getChildrens()){
                if(!nodesVisite.contains(n)){
                    nodesVisite.addLast(n);
                    Q.add(n);
                }
            }
        }
    }


}
