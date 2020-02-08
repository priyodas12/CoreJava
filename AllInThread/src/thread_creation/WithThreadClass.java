package thread_creation;

public class WithThreadClass {

	public static void main(String[] args) {
		System.out.println("Main thread start");
		new ThreadTaskOne();
		new ThreadTaskOne();
		System.out.println("Main thread end");

	}

}

class ThreadTaskOne extends Thread{
	private static int count=0;
	public int i=count++;
	
	@Override
	public void run() {
		System.out.println("Thread "+i+" starting");
		for(int j=0;j<10;j++) {
			System.out.println(j);
			try {
				Thread.sleep((long)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread "+i+" ending");
	}
	
	ThreadTaskOne(){
		this.start();
	}
}
