import java.util.Scanner;

public class TreciZadatak {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Unesi vrijednost prvog broja:");
            int n = scanner.nextInt();
            System.out.println("Unesi vrijednost drugog broja:");
            int m = scanner.nextInt();
            int rezultat = 0;
            for (int i = Math.min(m, n); i <= Math.max(m, n); i++) {
                if (i % 2 == 0) {
                    rezultat++;
                }
            }
            System.out.println(rezultat);
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
