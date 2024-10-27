public class CetvrtiZadatak {
    static void ispisiOcjenu(int ocjena) {
        switch (ocjena) {
            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:
                System.out.println("Vrlo dobar");
                break;
            case 5:
                System.out.println("Odlican");
                break;

            default:
                System.out.println("Greska");
                break;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            System.out.println(i + " ");
            ispisiOcjenu(i);
        }
    }
}
