package dataStructure;

public class GraphDemo {

	public static void main(String[] args) {
		// Adjacency Matrix = an 2d array to store 1 or 0 to represent edges
		// time complexity to check an Edge:O(1)
		// space complexity to store the Edge:O(n^2)
		
		Graph graph = new Graph(5);
		
		graph.addNode(new Node('a'));
		graph.addNode(new Node('b'));
		graph.addNode(new Node('c'));
		graph.addNode(new Node('d'));
		graph.addNode(new Node('e'));
		
		graph.addEdge(0,1);
		graph.addEdge(1,2);
		graph.addEdge(1,4);
		graph.addEdge(2,3);
		graph.addEdge(2,4);
		graph.addEdge(4,0);
		graph.addEdge(4,2);
		
		graph.print();

	}

}
