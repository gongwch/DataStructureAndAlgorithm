package dataStructure;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> StackLikelinkedList = new LinkedList<String>();

		// Take linkedList as a Stack
		StackLikelinkedList.push("A");
		StackLikelinkedList.push("B");
		StackLikelinkedList.push("C");
		StackLikelinkedList.push("D");

		StackLikelinkedList.pop();

		System.out.println(StackLikelinkedList);

		// Take linkedList as a Queue
		LinkedList<String> QueueLikeLinkedList = new LinkedList<String>();

		QueueLikeLinkedList.offer("Anna");
		QueueLikeLinkedList.offer("Christina");
		QueueLikeLinkedList.offer("Natsuko");
		QueueLikeLinkedList.offer("Maki");

		QueueLikeLinkedList.add(1, "Artmio");
		QueueLikeLinkedList.addFirst("Hatsune");
		String first = QueueLikeLinkedList.removeFirst();
		System.out.println(first);
		System.out.println(QueueLikeLinkedList);

	}

}
