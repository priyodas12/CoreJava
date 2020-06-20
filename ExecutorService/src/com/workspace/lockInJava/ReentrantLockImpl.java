package com.workspace.lockInJava;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockImpl {

    private static ReentrantLock reentrantLock=new ReentrantLock();

    private static int a=10;

    private static void accessResource() {

        reentrantLock.lock();

        a++;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        reentrantLock.unlock();
    }

    public static void main(String[] args) {

         Thread t1=new Thread(()->{
             accessResource();
             System.out.println(Thread.currentThread().getName()+" prints "+a);
         });
         Thread t2=new Thread(()->{
             accessResource();
             System.out.println(Thread.currentThread().getName()+" prints "+a);
         });
         Thread t3=new Thread(()->{
             accessResource();
             System.out.println(Thread.currentThread().getName()+" prints "+a);
         });
         Thread t4=new Thread(()->{
             accessResource();
             System.out.println(Thread.currentThread().getName()+" prints "+a);
         });

         t1.start();
         t2.start();
         t3.start();
         t4.start();

    }
    
}
