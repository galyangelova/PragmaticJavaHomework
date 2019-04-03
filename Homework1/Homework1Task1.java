import java.util.Scanner;

public class Homework1Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете А");
        double a = scanner.nextDouble();
        System.out.println("Въведете B");
        double b = scanner.nextDouble();
        System.out.println("Въведете C: ");
        double c = scanner.nextDouble();
        if (a < c && c < b) {
            System.out.println("Числото " + c + " е между " + a + " и " + b);
        }
    }
}
