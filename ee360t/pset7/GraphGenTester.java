package ee360t.pset7;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GraphGenTester {
    @Test public void theoe0() throws Exception {
        assertEquals(1, GraphGenerator.generateAllGraphs(1, "hasExactlyOneEdge").size());
    }
    
    @Test public void theoe1() throws Exception {
        assertEquals(4, GraphGenerator.generateAllGraphs(2, "hasExactlyOneEdge").size());
    }
    

    @Test public void theoe2() throws Exception {
        assertEquals(9, GraphGenerator.generateAllGraphs(3, "hasExactlyOneEdge").size());
    }
    
    @Test public void tir0() throws Exception {
        assertEquals(1, GraphGenerator.generateAllGraphs(1, "isReflexive").size());
    }
    
    @Test public void tir1() throws Exception {
        assertEquals(4, GraphGenerator.generateAllGraphs(2, "isReflexive").size());
    }
    
    @Test public void tir2() throws Exception {
        assertEquals(64, GraphGenerator.generateAllGraphs(3, "isReflexive").size());
    }
    
    @Test public void tis0() throws Exception {
        assertEquals(2, GraphGenerator.generateAllGraphs(1, "isSymmetric").size());
    }
    
    @Test public void tis1() throws Exception {
        assertEquals(8, GraphGenerator.generateAllGraphs(2, "isSymmetric").size());
    }
    
    @Test public void tis2() throws Exception {
        assertEquals(64, GraphGenerator.generateAllGraphs(3, "isSymmetric").size());
    }
    
    @Test public void titr0() throws Exception {
        assertEquals(2, GraphGenerator.generateAllGraphs(1, "isTransitive").size());
    }
    
    @Test public void titr1() throws Exception {
        assertEquals(13, GraphGenerator.generateAllGraphs(2, "isTransitive").size());
    }
    
    @Test public void titr2() throws Exception {
        assertEquals(171, GraphGenerator.generateAllGraphs(3, "isTransitive").size());
    }
    
    @Test public void theoeir() throws Exception {
        assertEquals(0, GraphGenerator.generateAllGraphs(3,
            new String[]{"hasExactlyOneEdge", "isReflexive"}).size());
    }
    
    @Test public void theoeis() throws Exception {
        assertEquals(3, GraphGenerator.generateAllGraphs(3,
            new String[]{"hasExactlyOneEdge", "isSymmetric"}).size());
    }
    
    @Test public void theoeitr() throws Exception {assertEquals(9, GraphGenerator.generateAllGraphs(3,
        new String[]{"hasExactlyOneEdge", "isTransitive"}).size());
    }
    
    @Test public void teq0() throws Exception {
        assertEquals(1, GraphGenerator.generateAllGraphs(1,
            new String[]{"isReflexive", "isSymmetric", "isTransitive"}).size());
    }
    
    @Test public void teq1() throws Exception {
        assertEquals(2, GraphGenerator.generateAllGraphs(2,
            new String[]{"isReflexive", "isSymmetric", "isTransitive"}).size());
    }
    
    @Test public void teq2() throws Exception {
        assertEquals(5, GraphGenerator.generateAllGraphs(3,
            new String[]{"isReflexive", "isSymmetric", "isTransitive"}).size());
    }
}