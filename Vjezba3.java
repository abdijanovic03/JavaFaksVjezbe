import java.util.Scanner;

public class Vjezba3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi vrijednost prvog broja:");
        int n = scanner.nextInt();
        System.out.println("Unesi vrijednost drugi broja:");
        int m = scanner.nextInt();
        int rez = 0;
        for (int i = Math.min(n, m); i <= Math.max(n, m); i++) {
            if (i % 2 == 0)
                rez++;
        }
        System.out.println(rez);
    }
}
