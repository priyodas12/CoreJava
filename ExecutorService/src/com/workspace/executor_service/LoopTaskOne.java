package com.workspace.executor_service;

public class LoopTaskOne implements Runnable{
	private static int count=0;
	public int i;
	
	@Override
	public void run() {
		String currentThreadName=Thread.currentThread().getName();
		System.out.println("Thread "+currentThreadName+" executing, task id->"+i+" starting");
		for(int j=0;j<10;j++) {
			System.out.println("Printed by "+ currentThreadName +">"+j);
			try {
				Thread.sleep((long)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread "+currentThreadName+" executing, task id"+i+" ending");
	}
	
	public LoopTaskOne(){
		this.i=count++;
	}
}

