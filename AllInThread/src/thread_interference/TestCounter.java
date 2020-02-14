package thread_interference;

public class TestCounter {
	public static void main(String[] args) throws InterruptedException {
		
		Counter c=new Counter();
		Counter c2=null;
		
		Runnable r1=()->{
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//synchronized (c) {
					c.increment();
					c.printVal();
				//}
				
			}
			
		   };
		Runnable r2=()->{
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//synchronized (c) {
					c.decrement();
					c.printVal();
					//}
				
				}
		    };
		    
		       Object print() {
		    	return;
		    }
		    
		 Thread t1=new Thread(r1);
		 Thread t2=new Thread(r2);
		 
		 t1.start();
		 //t1.join();
		 t2.start();
		 
		}
		
	}

