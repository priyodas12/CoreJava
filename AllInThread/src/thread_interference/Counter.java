package thread_interference;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter  {
	
	private AtomicInteger i=new AtomicInteger(10);
	
	
	public void increment() {
		i.incrementAndGet();
	}
	
	public void decrement() {
		i.decrementAndGet();
	}
	
	public void printVal() {
		System.out.println(i+" from "+Thread.currentThread().getName());
	}
}
