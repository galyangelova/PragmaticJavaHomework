import java.util.Scanner;

public class Homework1Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете А");
        int a = scanner.nextInt();
        System.out.println("Въведете B");
        int b = scanner.nextInt();
	int tmp = a;
	a = b;
	b = tmp;
	System.out.println("A e вече " + a);
	System.out.println("B e вече " + b);
    }
}
