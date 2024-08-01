import java.util.*;
public class BFS {
    public static void main(String[] args) {
      Map<Integer, List<Integer>> graph = GraphOp.makeGraph();
      GraphOp.bfs(graph, 1);
  }
}
/*
1 : 2,3,5
2 : 1,3,4
3: 1,4,5
4: 2,3,5
5: 1,4
visited: 1 2 3 5 4|  queue:     | print: 1 2 3 5 4
*/
class GraphOp {
  public static void bfs(Map<Integer, List<Integer>> graph, int start) {
    Set<Integer> visited = new HashSet<Integer>(); //marking visit will happen
                                                 
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(start); //add and mark as visited 
    visited.add(start); //mark visit
    
    while(!queue.isEmpty()) {
      int queueNode = queue.poll(); //delete and do visit
      System.out.printf("%d ",queueNode);//do visit
      
      //add neighbours to the queue if not visited
      List<Integer> neighbours = graph.get(queueNode);
      for(int neighbour : neighbours) {
        if(!visited.contains(neighbour)) {
          queue.add(neighbour);//add and mark as visited
          visited.add(neighbour);//mark visit
        }
      }
    }
  }
  public static Map<Integer, List<Integer>> makeGraph() {
      Map<Integer,List<Integer>> graph = new HashMap<Integer,List<Integer>>();
      List<Integer> neighbours_1 = new ArrayList<Integer>();
      neighbours_1.add(2);
      neighbours_1.add(3);
      neighbours_1.add(5);
      List<Integer> neighbours_2 = new ArrayList<Integer>();
      neighbours_2.add(1);
      neighbours_2.add(3);
      neighbours_2.add(4);
      List<Integer> neighbours_3 = new ArrayList<Integer>();
      neighbours_3.add(1);
      neighbours_3.add(4);
      neighbours_3.add(5);
      List<Integer> neighbours_4 = new ArrayList<Integer>();
      neighbours_4.add(2);
      neighbours_4.add(3);
      neighbours_4.add(5);
      List<Integer> neighbours_5 = new ArrayList<Integer>();
      neighbours_5.add(1);
      neighbours_5.add(4);
      graph.put(1,neighbours_1);
      graph.put(2,neighbours_2);
      graph.put(3,neighbours_3);
      graph.put(4,neighbours_4);
      graph.put(5,neighbours_5);
      return graph;
  }
}