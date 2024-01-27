/**
 * 
 */
package dataStructure;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collections;
/**
 * @author oasis
 *
 */
public class PriorityQueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Priority Queue is a FIFO data structure with the highest priority first in.
		Queue<String> q = new PriorityQueue<String>(Collections.reverseOrder());

		q.offer("C");
		q.offer("b");
		q.offer("a");
		q.offer("d");
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
