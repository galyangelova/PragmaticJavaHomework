import java.util.Scanner;

public class Homework2Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете А");
		int a = scanner.nextInt();
		System.out.println("Въведете B");
		int b = scanner.nextInt();
		int min = 0;
		int max = 0;
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
	}
}
