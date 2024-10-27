import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class DrugiZadatak {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Unesi vrijednost N:");
            int N = Integer.parseInt(reader.readLine());
            int rez = 1;
            for (int i = 1; i <= N; i++) {
                rez *= i;
            }
            System.out.println("Faktorijel broja " + N + " je: " + rez);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
    }
}
