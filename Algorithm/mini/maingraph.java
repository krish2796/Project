
package mini;

import java.util.ArrayList;

import javax.swing.JFrame;


public class maingraph {
    public static class Edge {
		  private int fromNodeIndex;
		  private int toNodeIndex;
		  private int length;
		  public Edge(int fromNodeIndex, int toNodeIndex, int length) {
		    this.fromNodeIndex = fromNodeIndex;
		    this.toNodeIndex = toNodeIndex;
		    this.length = length;
		  }
		  public int getFromNodeIndex() {
		    return fromNodeIndex;
		  }
		  public int getToNodeIndex() {
		    return toNodeIndex;
		  }
		  public int getLength() {
		    return length;
		  }
		  // determines the neighbouring node of a supplied node, based on the two nodes connected by this edge
		  public int getNeighbourIndex(int nodeIndex) {
		    if (this.fromNodeIndex == nodeIndex) {
		      return this.toNodeIndex;
		    } else {
		      return this.fromNodeIndex;
		   }
		  }
		}
	
	
	public static class Node {
		  private int distanceFromSource = Integer.MAX_VALUE;
		  private boolean visited;
		  private ArrayList<Edge> edges = new ArrayList<Edge>(); // now we must create edges
		  public int getDistanceFromSource() {
		    return distanceFromSource;
		  }
		  public void setDistanceFromSource(int distanceFromSource) {
		    this.distanceFromSource = distanceFromSource;
		  }
		  public boolean isVisited() {
		    return visited;
		  }
		  public void setVisited(boolean visited) {
		    this.visited = visited;
		  }
		  public ArrayList<Edge> getEdges() {
		    return edges;
		  }
		  public void setEdges(ArrayList<Edge> edges) {
		    this.edges = edges;
		  }
		}
	
	
	public static class Graph {
		  private Node[] nodes;
		  private int noOfNodes;
		  private Edge[] edges;
		  private int noOfEdges;
		  public Graph(Edge[] edges) {
		    this.edges = edges;
		    // create all nodes ready to be updated with the edges
		    this.noOfNodes = calculateNoOfNodes(edges);
		    this.nodes = new Node[this.noOfNodes];
		    for (int n = 0; n < this.noOfNodes; n++) {
		      this.nodes[n] = new Node();
		    }
		    // add all the edges to the nodes, each edge added to two nodes (to and from)
		    this.noOfEdges = edges.length;
		    for (int edgeToAdd = 0; edgeToAdd < this.noOfEdges; edgeToAdd++) {
		      this.nodes[edges[edgeToAdd].getFromNodeIndex()].getEdges().add(edges[edgeToAdd]);
		      this.nodes[edges[edgeToAdd].getToNodeIndex()].getEdges().add(edges[edgeToAdd]);
		    }
		  }
		  private int calculateNoOfNodes(Edge[] edges) {
		    int noOfNodes = 0;
		    for (Edge e : edges) {
		      if (e.getToNodeIndex() > noOfNodes)
		        noOfNodes = e.getToNodeIndex();
		      if (e.getFromNodeIndex() > noOfNodes)
		        noOfNodes = e.getFromNodeIndex();
		    }
		    noOfNodes++;
		    return noOfNodes;
		  }
		  // next video to implement the Dijkstra algorithm !!!
		  public void calculateShortestDistances(int a) {
			  int b = a;
		    // node 0 as source
		    this.nodes[a].setDistanceFromSource(0);
		    int nextNode = a;
		    // visit every node
		    for (int i = 0; i < this.nodes.length; i++) {
		      // loop around the edges of current node
		      ArrayList<Edge> currentNodeEdges = this.nodes[nextNode].getEdges();
		      for (int joinedEdge = 0; joinedEdge < currentNodeEdges.size(); joinedEdge++) {
		        int neighbourIndex = currentNodeEdges.get(joinedEdge).getNeighbourIndex(nextNode);
		        // only if not visited
		        if (!this.nodes[neighbourIndex].isVisited()) {
		          int tentative = this.nodes[nextNode].getDistanceFromSource()+currentNodeEdges.get(joinedEdge).getLength() ;//past hear
		          if (tentative < nodes[neighbourIndex].getDistanceFromSource()) {
		            nodes[neighbourIndex].setDistanceFromSource(tentative);
		          }
		        }
		      }
		      // all neighbours checked so node visited
		      nodes[nextNode].setVisited(true);
		      // next node must be with shortest distance
		      nextNode = getNodeShortestDistanced();
		   }
		  }
		  // now we're going to implement this method in next part !
		  private int getNodeShortestDistanced() {
		    int storedNodeIndex = 0;
		    int storedDist = Integer.MAX_VALUE;
		    for (int i =0 ; i < this.nodes.length; i++) {
		      int currentDist = this.nodes[i].getDistanceFromSource();
		      if (!this.nodes[i].isVisited() && currentDist < storedDist) {
		        storedDist = currentDist;
		        storedNodeIndex = i;
		      }
		    }
		    return storedNodeIndex;
		  }
		  // display result
		  public int printResult(int b,int c) {
		    String output = "Number of nodes = " + this.noOfNodes;
                  
		    output += "\nNumber of edges = " + this.noOfEdges;
		    
		      output = ("\nThe shortest distance from node " + b + " to node "  + c + " is " + nodes[c].getDistanceFromSource());
                   int a[]={b,c,nodes[c].getDistanceFromSource()};
                    
                    
		    
                  System.out.println(output);
                  return nodes[c].getDistanceFromSource();
		    
                   
		  }
		  public Node[] getNodes() {
		    return nodes;
		  }
		  public int getNoOfNodes() {
		    return noOfNodes;
		  }
		  public Edge[] getEdges() {
		    return edges;
		  }
		  public int getNoOfEdges() {
		    return noOfEdges;
		  }
		}
	
	
	public static void main (String []args) {
		gui Gui = new gui();
        
		   Gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   Gui.setSize(800,800);
		   Gui.setVisible(true);
		   
		   //System.out.println( Gui.getc1());
		   
		  
				    
				    //g.printResult(source,2); 
		  
	} 

}
