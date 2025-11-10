public class Exo2 {
    public static void main(String[] args) {
        System.out.println("Arguments inversés :");
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
        System.out.println("\n\nArguments inversés et lettres inversées :");
        for (int i = args.length - 1; i >= 0; i--) {
            String mot = args[i];
            String inverse = new StringBuilder(mot).reverse().toString();
            System.out.print(inverse + " ");
        }
    }
}