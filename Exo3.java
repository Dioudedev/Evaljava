import java.util.Random;

public class Exo3 {
    public static int positionMin(int[] tab, int debut) {
        int posMin = debut;
        for (int i = debut + 1; i < tab.length; i++) {
            if (tab[i] < tab[posMin]) {
                posMin = i;
            }
        }
        return posMin;
    }
    public static void triSelection(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            int posMin = positionMin(tab, i);
            int temp = tab[i];
            tab[i] = tab[posMin];
            tab[posMin] = temp;
        }
    }
    public static void afficherTableau(int[] tab) {
        for (int val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(100);
        }

        System.out.println("Avant tri :");
        afficherTableau(tab);

        triSelection(tab);

        System.out.println("Après tri :");
        afficherTableau(tab);
    }
}