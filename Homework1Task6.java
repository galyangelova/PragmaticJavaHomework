import java.util.Scanner;

public class Homework1Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете a1");
        int a1 = scanner.nextInt();
        System.out.println("Въведете a2");
        int a2 = scanner.nextInt();
        System.out.println("Въведете a3");
        int a3 = scanner.nextInt();
	int tmp = a1;
	a1 = a2;
	a2 = a3;
	a3 = tmp;
	System.out.println("a1 e вече " + a1);
	System.out.println("a2 e вече " + a2);
	System.out.println("a3 e вече " + a3);
    }
}
