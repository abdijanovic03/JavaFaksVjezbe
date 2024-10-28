public class Vjezba2 {
    public static void main(String[] args) {

        int x = 3, y = 4, z = 6;

        if (x > y) {
            if (x > z) {
                System.out.println("X je najvece");
            } else {
                System.out.println("Z je najvece");
            }
        } else {
            if (y > z)
                System.out.println("Y je najvece");
            else
                System.out.println("Z je najvece");

        }

    }
}
