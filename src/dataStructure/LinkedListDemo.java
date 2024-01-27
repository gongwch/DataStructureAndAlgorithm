package dataStructure;
import java.util.Queue;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// FIFO = First In First Out data structure
		// a collection for holding elements prior to processing the liner structure.
		
		// add = enqueue, offer()
		// remove = dequeue, poll()
		
		Queue<String> q = new LinkedList<String>();
		
		q.offer("Anna");
		q.offer("Bob");
		q.offer("Christina");
		q.offer("Artmio");

		System.out.println(q.isEmpty());
		System.out.println(q.size());
		System.out.println(q.contains("Anna"));
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
	}

}
