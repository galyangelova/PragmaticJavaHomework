class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

	public Computer(int year, double price, boolean isNotebook, int hardDiskMemory, int freeMemory, String operationSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}


	public void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	public void useMemory(double memory) {
		if (memory > freeMemory) {
			System.out.println("Not enough memory");
		} else {
			freeMemory -= memory;
		}
	}
}

public class ComputerDemo {
	public static void main(String[] args) {
		Computer computer1 = new Computer(2018, 999.98, false, 1024, 16000, "Mac");
		Computer computer2 = new Computer(2017, 1999.98, true, 2048, 12000, "Windows");
		computer1.useMemory(100);
		computer2.changeOperationSystem("Linux");
		System.out.println("Computer1:" + "year="+computer1.year + " price="+computer1.price + " isNotebook="+computer1.isNotebook+ " hardDiskMemory="+computer1.hardDiskMemory + " freeMemory="+computer1.freeMemory  + " operationSystem="+computer1.operationSystem);
		System.out.println("Computer2:" + "year="+computer2.year + " price="+computer2.price + " isNotebook="+computer2.isNotebook+ " hardDiskMemory="+computer2.hardDiskMemory + " freeMemory="+computer2.freeMemory  + " operationSystem="+computer2.operationSystem);
					  
	}
}