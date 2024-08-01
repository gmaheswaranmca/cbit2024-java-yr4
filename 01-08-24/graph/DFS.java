import java.util.*;
public class DFS {
    public static void main(String[] args) {
      Map<Integer, List<Integer>> graph = GraphOp.makeGraph();
      GraphOp.dfs(graph, 1);
  }
}
/*
1 : 2,3,5
2 : 1,3,4
3: 1,4,5
4: 2,3,5
5: 1,4
visited: 1 5 4 3 2|  stack:   | print: 1 5 4 3 2
*/
class GraphOp {
  public static void dfs(Map<Integer, List<Integer>> graph, int start) {
    Set<Integer> visited = new HashSet<Integer>(); //marking visit will happen
                                                 
    Stack<Integer> stack = new Stack<Integer>();
    
    stack.push(start);
    while(!stack.isEmpty()) {
      int stackNode = stack.pop(); //2
      if(!visited.contains(stackNode)) {
        visited.add(stackNode); //marked 
        System.out.printf("%d ",stackNode); //do visit
        //add neighbours to the stack if not visited
        List<Integer> neighbours = graph.get(stackNode);
        for(int neighbour : neighbours) {
          if(!visited.contains(neighbour)) {
            stack.push(neighbour);
          }
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