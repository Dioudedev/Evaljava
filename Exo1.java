public class Exo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("zzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("zz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}