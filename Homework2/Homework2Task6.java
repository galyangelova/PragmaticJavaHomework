import java.util.Scanner;

public class Homework2Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете А");
		int a = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		System.out.print(sum);
	}
}
