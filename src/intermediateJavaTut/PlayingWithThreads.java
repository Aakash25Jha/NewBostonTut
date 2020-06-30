package intermediateJavaTut;

import java.util.Random;

public class PlayingWithThreads implements Runnable {

	String name;
	int time;
	Random r = new Random();

	public PlayingWithThreads(String x) {
		this.name = x;
		this.time = r.nextInt(999);
	}

	@Override
		public void run() {
		try {
		System.out.printf("%s is sleeping for %d",name,time);
		System.out.println();
		Thread.sleep(time);		
		System.out.printf("%s is done",name);
		System.out.println();
		}
		catch(Exception e){}
	}
}
