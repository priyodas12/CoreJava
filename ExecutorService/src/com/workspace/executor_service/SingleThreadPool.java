package com.workspace.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" Thread Starts Here...");
		
		ExecutorService exService=Executors.newSingleThreadExecutor(new ThreadName());
		for(int i=0;i<3;i++) {
			exService.execute(new Thread(new LoopTaskOne()));
		}
		exService.shutdown();
		
		System.out.println(Thread.currentThread().getName()+"  Thread ends Here...");

	}

}
