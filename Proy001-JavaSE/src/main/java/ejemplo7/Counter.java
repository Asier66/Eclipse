package ejemplo7;

public class Counter {
	private int serialNumber;
	public static int counter = 0;
	
	public Counter() {
		this.serialNumber = ++counter;
	}

	public int getSerialNumber() {
		return serialNumber;
	}
	
	public static void main(String[] args) {
		System.out.printf("Counter vale %d %n " ,Counter.counter);
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
		System.out.printf("c1 %d %n c2 %d %n c3 %d %n", c1.getSerialNumber(), c2.getSerialNumber(), c3.getSerialNumber() );
		System.out.printf("Counter vale ahora %d %n " ,Counter.counter);
	}
}
