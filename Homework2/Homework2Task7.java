import java.util.Scanner;

public class Homework2Task7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете А");
		int a = scanner.nextInt();
		for (int i = 3; i <= a; i++) {
			if (i % 3 == 0) {
				System.out.print(i + ",");
			}
		}
	}
}
