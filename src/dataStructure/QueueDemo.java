package dataStructure;
import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
