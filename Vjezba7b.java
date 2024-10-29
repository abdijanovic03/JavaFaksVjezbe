import java.util.Scanner;

public class Vjezba7b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi prvi broj:");
        int a = scanner.nextInt();
        System.out.println("Unesi drugi broj:");
        int b = scanner.nextInt();
        System.out.println("Unesi treci broj:");
        int c = scanner.nextInt();
        double sr_vrij;
        sr_vrij = (a + b + c) / 3.;
        for (int i = 0; i < a; i++) {
            System.out.format("%d) %4.2f\n", i + 1, sr_vrij);
        }
    }
}