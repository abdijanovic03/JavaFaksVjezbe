import java.util.Scanner;

public class Vjezba6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi broj:");
        int a = scanner.nextInt();
        int original = a;
        int obrnuto = 0;
        while (original != 0) {
            obrnuto = (obrnuto * 10) + (original % 10);
            original /= 10;
        }

        System.out.println("Obrnuti broj je: " + " ");
        System.out.println(" " + obrnuto);
        if (original == obrnuto) {
            System.out.print("Broj je simetrican!");
        } else {
            System.out.println("Broj nije simetrican!");
        }

    }
}
