import java.util.Scanner;

public class Vjezba10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int fallback = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if (i % 4 == 0) {
                System.out.println(i + " je prestupna godina");
                fallback++;
            }
        }
        if (fallback == 0) {
            System.out.println("Izmedju datom perioda nema prestupnih godina");
        }
    }
}
