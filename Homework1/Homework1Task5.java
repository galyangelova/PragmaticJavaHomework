import java.util.Scanner;

public class Homework1Task5 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Въведете А");
	int a = scanner.nextInt();
	System.out.println("Въведете B");
	int b = scanner.nextInt();
	System.out.println("Въведете C: ");
	int c = scanner.nextInt();
	if (a > b) {
		if (b > c) {
			System.out.println(a + " " + b + " " + c);
		} else {
			if (c < a) {
				System.out.println(a + " " + c + " " + b);
			} else {
				System.out.println(c + " " + a + " " + b);
			}
		}
	} else {
		if (c > b) {
			System.out.println(c + " " + b + " " + a);
		} else {
			if (c > a) {
				System.out.println(b + " " + c + " " + a);
			} else {
				System.out.println(b + " " + a + " " + c);
			}
		}
	}
    } 	
}
