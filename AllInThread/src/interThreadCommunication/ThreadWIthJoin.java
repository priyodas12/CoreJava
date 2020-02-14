package interThreadCommunication;

import java.security.Timestamp;
import java.util.Date;

public class ThreadWIthJoin {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	Runnable r1=()->{
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1700);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i+" From"+Thread.currentThread().getName()+" Time:"+new java.sql.Timestamp(new Date().getTime()));
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
	
	t1.setDaemon(true);
	System.out.println(t1.toString()+" by "+Thread.currentThread().getName());
	//t1.join();
	t2.start();
	t2.join(3000);
	//t2.interrupt();
	t1.start();
	
	//Thread.dumpStack();

	}
}