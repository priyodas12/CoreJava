package com.workspace.executor_service;

public class MultipleThreadInstance {

	public static void main(String[] args) {
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
		//1 Java thread=1 OS Thread i.e. costly operation.
		for(int i=0;i<10;i++) {
			new Thread(r1).start();
		}
	}

}
