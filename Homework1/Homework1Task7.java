import java.util.Scanner;

public class Homework1Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете час");
        int hour = scanner.nextInt();
        System.out.println("Въведете сума пари");
        float money = scanner.nextFloat();
        System.out.println("Здрав ли сте?");
        boolean healthy = scanner.nextBoolean();

	if (healthy == false) {
		System.out.println("Няма да излизам");
		if (money > 0) {
			System.out.println("Ще си купя лекарства");
		} else {
			System.out.println("Ще седя вкъщи и ще пия чай");
		}
	} else {
		if (money > 10) {
			System.out.println("Ще отида на кафе");
		}		
	}
    }
}
