package intermediateJavaTut;
import intermediateJavaTut.*;

public class PlayingWIthThread2 {
	
	public static void main(String[] args) {
		Thread t1= new Thread(new PlayingWithThreads("one"));
		Thread t2= new Thread(new PlayingWithThreads("two"));
		Thread t3= new Thread(new PlayingWithThreads("three"));
		Thread t4= new Thread(new PlayingWithThreads("four"));
		Thread t5= new Thread(new PlayingWithThreads("five"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
