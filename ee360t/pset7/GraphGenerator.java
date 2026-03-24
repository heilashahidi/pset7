package ee360t.pset7;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class GraphGenerator {
    public static Set<Graph> generateAllGraphs(int num){
        // pre: num >= 0
        // post: returns a set of all graphs that have num nodes

        // your code goes here
        // ...

        Set<Graph> graphs = new HashSet<>();

        for (int combo = 0; combo < Math.pow(2, Math.pow(num, 2)); combo++){
            
            //create a new graph
            Graph g = new Graph(num);

            //now loop through each position
            for (int pos = 0; pos < Math.pow(num, 2); pos++){
                int row = pos / num;
                int col = pos % num;

                //check if this position's bit is 1 in combo
                if((combo & (1 << pos)) != 0){
                    //add an edge at row, col
                    g.addEdge(row, col);
                }
            }

            //add graph to the set
            graphs.add(g);

        }

        return graphs;

    }

    public static Set<Graph> generateAllGraphs(int num, String property) throws Exception{
        // pre: num >= 0 and
        //      property is the name of a valid boolean method in class Graph
        // post: returns a set of all graphs (with num nodes) that represent binary 
        //        relations with the given property



        return generateAllGraphs(num, new String[] { property });
    

    }

    public static Set<Graph> generateAllGraphs(int num, String[] properties) throws Exception{
        // pre: num >= 0 and
        //      each element of properties is the name of a valid boolean methd in class Graph
        // post: returns a set of all graphs (with num nodes) that represent binary
        //       relations with all the given properties

        // your code goes here
        // ... 

        Set<Graph> allgraphs = generateAllGraphs(num);
        Set<Graph> graphs = new HashSet<>();

       
        //to loop through a set
        for (Graph g: allgraphs){
             boolean allPassed = true;
            for (String property: properties){

                Method m = Graph.class.getMethod(property);
                boolean result = (boolean) m.invoke(g);

                if (result == false){
                    allPassed = false;
                    break;
                }


            }
            if (allPassed){
                graphs.add(g);
            }

        }

        return graphs;
      

    
    }
    

}
