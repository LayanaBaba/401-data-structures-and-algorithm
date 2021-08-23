package graphs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeightedGraphTest {

    @Test
    public void businessTrip(){
        int vertices = 6;
        WeightedGraph.Graph graph = new WeightedGraph.Graph(vertices);
        graph.addEgde("0", "1", 4);
        graph.addEgde("0", "2", 3);
        graph.addEgde("1", "3", 2);

        assertTrue(graph.businessTrip("1", "3", 2));
    }

    @Test
    public void businessTripFaied(){
        int vertices = 6;
        WeightedGraph.Graph graph = new WeightedGraph.Graph(vertices);
        graph.addEgde("0", "1", 4);
        graph.addEgde("0", "2", 3);
        graph.addEgde("1", "3", 2);

        assertFalse(graph.businessTrip("0", "3", 0));
    }
}
