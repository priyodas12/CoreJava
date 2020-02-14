package interThreadCommunication;

public class ThreadWIthJoin {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	Runnable r1=()->{
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i+" From"+Thread.currentThread().getName());
			}
		};
		
	Runnable r2=()->{
			for (int i = 'a'; i < 'j'; i++) {
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println((char)i+" From"+Thread.currentThread().getName());
			}
		};
		
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	
	
	//t1.join();
	t2.start();
	t2.join();
	t1.start();

	}
}