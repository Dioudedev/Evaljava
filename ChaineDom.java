import java.util.LinkedList;

public class ChaineDom {

    private LinkedList<Domino> chaine;

    public ChaineDom(Domino d) {
        chaine = new LinkedList<>();
        chaine.add(d);
    }
    public int left() {
        return chaine.getFirst().getLeft();
    }
    public int right() {
        return chaine.getLast().getRight();
    }

    public int jouable(Domino d) {
        Domino gauche = chaine.getFirst();
        Domino droite = chaine.getLast();

        int compG = d.compareTo(gauche);
        int compD = d.compareTo(droite);

        if (compG == 1 && compD == 1)
            return 2;
        else if (compG == 1)
            return -1;
        else if (compD == 1)
            return 1;
        else
            return 0;
    }

    public void addLeft(Domino d) {
        chaine.addFirst(d);
    }

    public void addRight(Domino d) {
        chaine.addLast(d);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Domino d : chaine) {
            sb.append(d.toString()).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Domino d1 = new Domino(2, 3);
        ChaineDom cd = new ChaineDom(d1);

        Domino d2 = new Domino(3, 6);
        Domino d3 = new Domino(2, 5);

        System.out.println("Chaîne initiale : " + cd);
        System.out.println("Jouabilité de d2 : " + cd.jouable(d2));
        System.out.println("Jouabilité de d3 : " + cd.jouable(d3));

        cd.addRight(d2);
        cd.addLeft(d3);

        System.out.println("Chaîne finale : " + cd);
    }
}