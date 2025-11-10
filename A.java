public class A {
    private int x; // ← maintenant privé !

    public A(int x) {
        this.x = x;
    }

    public int f() {
        return x + 3;
    }

    public A g(A a) {
        return new A(2 * x + 3 * a.x);
    }
}