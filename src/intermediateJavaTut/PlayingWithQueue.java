package intermediateJavaTut;

import java.util.PriorityQueue;

public class PlayingWithQueue {
	public static void main(String[] args) {
		
		PriorityQueue<String> q= new PriorityQueue<String>();
		q.offer("first");
		q.offer("second");
		q.offer("third");
		
		System.out.println(q);
		System.out.println();
		
		System.out.println(q.peek());
		System.out.println();
		
		q.poll();
		System.out.println(q);
		System.out.println();
		
		System.out.println(q.peek());
		System.out.println();
		
	}

}
