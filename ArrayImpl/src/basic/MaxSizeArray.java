package basic;

public class MaxSizeArray {

	public static void main(String[] args) {
		byte [] obj=new byte[Integer.MAX_VALUE-10];//java.lang.OutOfMemoryError: Java heap space
		long maxMem=Runtime.getRuntime().maxMemory();
		long freeMem=Runtime.getRuntime().freeMemory();
		long totalMem=Runtime.getRuntime().totalMemory();
		
		System.out.println("Max Memory::"+maxMem+" Free Memory::"+freeMem+" TotalMemory::"+totalMem);
	}

}
