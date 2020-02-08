package com.workspace.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*Fixed Thread pool*/
public class MultiThreadingInExecutorService {

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
		int coreCount=Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount);
		ExecutorService exService=Executors.newFixedThreadPool(coreCount);
		for(int i=0;i<11;i++) {
			exService.execute(new Thread(r1));
		}
		exService.shutdown();
	}

}
