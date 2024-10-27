public class PrviZadatak {
    public static void main(String[] args) {
        int niz1[] = { 2, 2, 3, 4, 5 };
        int niz2[] = new int[niz1.length];
        for (int i = 0; i < niz1.length; i++) {
            niz2[i] = niz1[i];
        }
        System.out.println("Niz 2:");

        for (int i = 0; i < niz2.length; i++) {
            System.out.println(niz2[i]);
        }
    }
}
