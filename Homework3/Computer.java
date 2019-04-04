public class Computer {
	int year;
	float price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

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
