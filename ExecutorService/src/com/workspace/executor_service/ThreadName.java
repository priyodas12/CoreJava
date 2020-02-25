package com.workspace.executor_service;

import java.util.concurrent.ThreadFactory;

public class ThreadName implements ThreadFactory {
	
	public static int count=0;
	public static String name="Executors_";
	@Override
	public Thread newThread(Runnable r) {
		Thread t=new Thread(r,name+count++);
		return t;
	}

}
