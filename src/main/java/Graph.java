import java.util.*;

public class Graph{

  private HashMap<String, ArrayList<String>> adjList= new HashMap<String, ArrayList<String>>();

  public boolean addVertex(String vertex){
    if(adjList.get(vertex) == null){
      adjList.put(vertex, new ArrayList<String>());
      return true;
    }
    return false;
  }

  public boolean addEdge(String vertex1, String vertex2){
    if(adjList.get(vertex1) == null || adjList.get(vertex2) == null){
      return false;
    }
    
    return (adjList.get(vertex2).add(vertex1) && adjList.get(vertex1).add(vertex2));
  }

  public boolean removeEdge(String vertex1, String vertex2){
    if(adjList.get(vertex1) == null || adjList.get(vertex2) == null){
      return false;
    }

    return (adjList.get(vertex2).remove(vertex1) && adjList.get(vertex1).remove(vertex2));
  }

  public boolean removeVertex(String vertex){
    if(adjList.get(vertex) == null){
      return false;
    }

    for(String otherVertex: adjList.get(vertex)){
      adjList.get(otherVertex).remove(vertex);
    }
    
    adjList.remove(vertex);
    return true;
    
  }
  
  public void printGraph(){
    System.out.println(adjList);
  }

  
  
  
}