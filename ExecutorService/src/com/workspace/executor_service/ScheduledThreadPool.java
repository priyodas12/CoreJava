package com.workspace.executor_service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
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
		
		//making the schedule of task
		ScheduledExecutorService schService=Executors.newScheduledThreadPool(10);
		
		//scheduling task in 5 sec delay.
		schService.schedule(new Thread(r1), 5, TimeUnit.SECONDS);
		
		
		
	}

}
