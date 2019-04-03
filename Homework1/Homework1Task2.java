import java.util.Scanner;

public class Homework1Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете А");
        int a = scanner.nextInt();
        System.out.println("Въведете B");
        int b = scanner.nextInt();
	int aPlusB = a + b;
	int aMinusB = a - b;
	int aModB = a % b;
	int aDivB = a / b;
	System.out.println("A + B е " + aPlusB);
	System.out.println("A - B е " + aMinusB);
	System.out.println("A % B е " + aModB);
	System.out.println("A / B е " + aDivB);
    }
}
