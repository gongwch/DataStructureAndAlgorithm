package dataStructure;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> bean = new Stack<String>();

		bean.push("a");
		bean.push("b");
		bean.push("c");
		bean.push("d");
		bean.push("e");

		System.out.println(bean.pop());
	}

}
