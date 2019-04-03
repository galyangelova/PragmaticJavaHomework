import java.util.Scanner;

public class Homework2Task9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете А");
		int a = scanner.nextInt();
		System.out.println("Въведете B");
		int b = scanner.nextInt();
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.print("skip " + i + ", ");
			} else {
				System.out.print(i * i + ", ");
				sum += i*i;
				if (sum > 200) {
					break;
				}
			}
		}
	}
}
