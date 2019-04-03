import java.util.Scanner;

public class Homework1Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете А");
        int a = scanner.nextInt();
        System.out.println("Въведете B");
        int b = scanner.nextInt();
        if (a < b) {
		System.out.println(a + " " + b);
	} else if (a > b) {
		System.out.println(b + " " + a);
	} else {
		System.out.println("А и B са еднакви");
	}
    }
}
