package deamon_thread;

public class LoopTaskTwo  implements Runnable{
	
	private static int count=0;
	public int i;
	public long sleeptime;
	
	@Override
	public void run() {
		String currentThreadName=Thread.currentThread().getName();
		String isDaemon=Thread.currentThread().isDaemon()?"DAEMON":"USER";
		System.out.println("Thread "+currentThreadName+" executing, task id->"+i+" starting");
		for(int j=0;j<10;j++) {
			System.out.println("Printed by "+ currentThreadName+" is "+isDaemon +">"+j);
			try {
				Thread.sleep(sleeptime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread "+currentThreadName+" executing, task id"+i+" ending");
	}
	
	public LoopTaskTwo(long sleeptime){
		this.i=count++;
		this.sleeptime=sleeptime;
	}

}
