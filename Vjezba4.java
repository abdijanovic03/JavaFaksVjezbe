import java.util.Scanner;

public class Vjezba4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Poluprecnik");
        int r = scanner.nextInt();
        double obim = 2 * r * Math.PI;
        System.out.println("Obim je:" + obim);
        double povrsina = r * r * Math.PI;
        System.out.println("Povrsina je:" + povrsina);

    }
}
