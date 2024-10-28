import java.util.Scanner;

public class Vjezba9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 4 == 0) {
            System.out.println("Godina je prestupna");
        } else {
            System.out.println("Godina nije prestupna");
        }
    }
}
