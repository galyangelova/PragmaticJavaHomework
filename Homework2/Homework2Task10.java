import java.util.Scanner;


public class Homework2Task10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете А");
		int a = scanner.nextInt();
		boolean prime = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println(a + " е просто число");
		} else {
			System.out.println(a + " не е просто число");
		}
	}
}
