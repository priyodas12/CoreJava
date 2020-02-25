package com.workspace.executor_service;

public class ThreadImpl {

	public static void main(String[] args) throws Exception {
		Runnable r1=()->{
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i+" from "+Thread.currentThread().getName());
			}
		};
		
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+" from "+Thread.currentThread().getName());
		}
		
		new Thread(r1).start();
	}

}
