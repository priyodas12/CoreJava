package deamon_thread;

public class DaemonThreadDemo {

	public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" thread starts...");
        new Thread(new LoopTaskTwo(500)).start();
		Thread t2=new Thread(new LoopTaskTwo(1500));
		t2.setDaemon(true);
		t2.start();
		
		System.out.println(Thread.currentThread().getName()+" thread ends...");
	}

}
