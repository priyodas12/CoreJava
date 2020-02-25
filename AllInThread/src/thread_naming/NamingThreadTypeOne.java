package thread_naming;

import common.LoopTaskOne;

public class NamingThreadTypeOne {
	public static void main(String[] args) {
		System.out.println("Main Thread Starts...");
		Thread t1=new Thread(new LoopTaskOne(),"mythread_1");
		t1.start();
		Thread t2=new Thread(new LoopTaskOne(),"mythread_2");
		t2.start();
		
		System.out.println("Main Thread ends...");
	}

}
