public class TestB {
    public static void main(String[] args) {
        B[] listeB = new B[3];
        B.nbCons();
        listeB[0] = new B("albert");
        B.nbCons();
        listeB[1] = new B("boris");
        B.nbCons();
        for (int i = 0; i < B.nbB; i++)
            System.out.println(listeB[i]);
    }
}