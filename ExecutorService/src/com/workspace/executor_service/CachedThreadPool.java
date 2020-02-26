package com.workspace.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * for lot of short-lived tasks
 * if thread idle>60 Sec corresponding thread will be killed.
 * */
public class CachedThreadPool {

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
		
		ExecutorService exService=Executors.newCachedThreadPool();
		for(int i=0;i<11;i++) {
			exService.execute(new Thread(r1));
		}
		exService.shutdown();
	}
}
