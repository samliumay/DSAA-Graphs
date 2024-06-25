public class Main {
  
  public static void main(String[] args) {


    System.out.println("Testing the Graph datastructure.");
    Graph graph = new Graph();

    System.out.print("Adding zort and zirt to the graph:");
    graph.addVertex("zort");
    graph.addVertex("zirt");
    graph.printGraph();

    
    System.out.print("Adding edge betwen zort and zirt.");
    graph.addEdge("zort","zirt");
    graph.printGraph();

    System.out.print("Removing edge betwen zort and zirt.");
    graph.removeEdge("zort","zirt");
    graph.printGraph();

    System.out.print("Removing edge betwen zort and zirt.");
    graph.addEdge("zort","zirt");
    graph.removeVertex("zort");
    graph.printGraph();
    


    
  }


}