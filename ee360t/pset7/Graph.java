
package ee360t.pset7;

import java.util.Arrays;
import java.util.Set;


public class Graph {
    private int numNodes; //number of nodes in the graph

    private boolean[][] edges;
    // edges[i][j] is true if and only if there is an edge from node i to node j

    // class invariant: edges != null edges is a square matrix;
    //                  numNodes >= 0; numNodes is number of rows in edges

    public Graph(int size){
        numNodes = size;
        edges = new boolean[size][size];
    }

    @Override
    public String toString(){
        return "numNodes: " + numNodes + "; " + "edges: " + Arrays.deepToString(edges);
    }
    
    @Override
    public boolean equals(Object o){
        if (o.getClass() != ee360t.pset7.Graph.class) return false;
        return toString().equals(o.toString());
    }

    @Override
    public int hashCode() {
        // your code goes here
        return toString().hashCode(); //returns the hash integer of the graph
    }

    public void addEdge(int from, int to){
        // postcondition: adds a directed edge "from" -> "to" to this graph
        edges[from][to] = true;
    }

    public int numEdges() {
        // post: returns the number of edges in this
        int count = 0;
        //your code goes here
        for (int i = 0; i < numNodes; i++) {        // Source vertex
            for (int j = 0; j < numNodes; j++) {    // Destination vertex
                if (edges[i][j]) {                  // If an edge exists
                    count = count + 1;              //count the edge
                }
            }
        }
        return count;
    }


    public boolean hasExactlyOneEdge(){
        // post: returns true if and only if there is exactly one edge in this

        // your code goes here
        if (numEdges() == 1){
             return true;
        }
        else {
            return false;
        }
           
    }

    public boolean isReflexive(){
        // post: returns true if this represents a refelxive relation

        //your code goes here
        for (int i = 0; i < numNodes; i++) {
            if (edges[i][i] == false){
                return false;
            }
            
        }
        return true;
    }

    public boolean isSymmetric() {
        // post: returns true if and only if this respresnts a symmetric relation

        // your code goes here
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                if (edges[i][j] && !edges[j][i]){
                    return false;
                }

            }
        }

        return true;

    }

    public boolean isTransitive(){
        // post: returns true if and only if this represnst a transitive relation

        //your code goes here 
        // your code goes here
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                for (int k = 0; k < numNodes; k++)
                    if (edges[i][j] && edges[j][k] && !edges[i][k]){
                        return false;
                    }

            }
        }
        return true;
    }

    public void add(Set<Graph> allGraphs) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}
