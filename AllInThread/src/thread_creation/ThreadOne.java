package thread_creation;

public class ThreadOne extends Thread {
	public ThreadOne() {
		System.out.println("Thread 1 Starting....");
	}
	
	@Override
	public void run() {
		for(int i=0;i<Math.random();i++) {
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("counting..."+i);
		}
	}
}
