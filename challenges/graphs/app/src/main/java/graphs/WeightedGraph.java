package graphs;

import java.util.LinkedList;

public class WeightedGraph {

        static class Edge {
            String source;
            String destination;
            int weight;

            public Edge(String source, String destination, int weight) {
                this.source = source;
                this.destination = destination;
                this.weight = weight;
            }
        }

        static class Graph {
            int vertices;
            LinkedList<Edge>[] adjacencylist;

            Graph(int vertices) {
                this.vertices = vertices;
                adjacencylist = new LinkedList[vertices];
                //initialize adjacency lists for all the vertices
                for (int i = 0; i <vertices ; i++) {
                    adjacencylist[i] = new LinkedList<>();
                }
            }

            public void addEgde(String source, String destination, int weight) {
                Edge edge = new Edge(source, destination, weight);
                adjacencylist[Integer.parseInt(source)].addFirst(edge); //for directed graph
            }

            public boolean businessTrip(String source, String destination, int weight){
                if (weight <= 0){
                    return false;
                }else {
                    return true;
                }
            }

            public void printGraph(){
                for (int i = 0; i <vertices ; i++) {
                    LinkedList<Edge> list = adjacencylist[i];
                    for (int j = 0; j <list.size() ; j++) {
                        System.out.println("vertex-" + i + " is connected to " +
                                list.get(j).destination + " with weight " +  list.get(j).weight);
                    }
                }
            }
        }
        public static void main(String[] args) {
            int vertices = 6;
            Graph graph = new Graph(vertices);
            graph.addEgde("0", "1", 4);
            graph.addEgde("0", "2", 3);
            graph.addEgde("1", "3", 2);


            graph.printGraph();
            System.out.println("--------------------------------------------------------------");
            System.out.println(graph.businessTrip("0", "3", 0));
            System.out.println(graph.businessTrip("1", "3", 2));

        }

}
