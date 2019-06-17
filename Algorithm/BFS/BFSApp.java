/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BFS;

/**
 *
 * @author HP
 */
public class BFSApp {
    public static void main(String[] args)
{
    Graph theGraph = new Graph();
    
    theGraph.addVertex('P');   // 0 (start for bfs)
    theGraph.addVertex('Q');
    theGraph.addVertex('R');
    theGraph.addVertex('S');
    theGraph.addVertex('T');
    
    theGraph.addEdge(0, 1);
    theGraph.addEdge(1, 3);
    theGraph.addEdge(0, 4);
    theGraph.addEdge(0, 2);
    theGraph.addEdge(1, 4);
    theGraph.addEdge(2, 3);
    theGraph.addEdge(3, 1);
    theGraph.addEdge(3, 2);
    theGraph.addEdge(3, 4);
    theGraph.addEdge(4, 1);
    theGraph.addEdge(4, 3);
    
     System.out.println("Visits: ");       
     theGraph.bfs(); // breadth-first search
     System.out.println();
      
    
}
    
}
