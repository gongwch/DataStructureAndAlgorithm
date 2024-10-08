package dataStructure;

import java.util.ArrayList;

public class Graph {
	protected ArrayList<Node> nodes;

	protected int[][] matrix;

	public Graph(int size) {
		nodes = new ArrayList<Node>();
		matrix = new int[size][size];
	}

	public void addNode(Node node) {
		nodes.add(node);
	}

	public void addEdge(int src, int target) {
		matrix[src][target] = 1;
	}

	public boolean checkEdge(int src, int target) {
		if (matrix[src][target] == 1) {
			return true;
		} else {
			return false;
		}
	}

	public void print() {
		System.out.print("  ");
		for (Node node : nodes) {
			System.out.print(node.getData() + " ");
		}
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(nodes.get(i).getData() + " ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
