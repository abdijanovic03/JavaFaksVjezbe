import java.util.Scanner;

public class Vjezba5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi broj:");
        int a = scanner.nextInt();
        int rez = 1;
        for (int i = 1; i <= a; i++) {
            rez *= i;
        }
        System.out.println("Faktorijel je:" + rez);
    }
}
