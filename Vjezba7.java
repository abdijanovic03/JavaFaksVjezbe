import java.util.Scanner;

public class Vjezba7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi a");
        int a = scanner.nextInt();
        System.out.println("Unesi b");
        int b = scanner.nextInt();
        System.out.println("Obim je: " + 2 * (a + b));
        System.out.println("Povrsina je: " + (a * b));
    }
}
