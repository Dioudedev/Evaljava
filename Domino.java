public class Domino {
    private int left;
    private int right;

    public Domino() {
        this.left = 0;
        this.right = 0;
    }

    public Domino(int i, int j) {
        this.left = i;
        this.right = j;
    }
    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public boolean isDomino() {
        return (left >= 0 && left <= 6) && (right >= 0 && right <= 6);
    }

    public boolean isDouble() {
        return left == right;
    }
    public int totalPoint() {
        return left + right;
    }

    public void rotate() {
        int temp = left;
        left = right;
        right = temp;
    }

    @Override
    public String toString() {
        return "[" + left + ";" + right + "]";
    }

    public int compareTo(Domino d) {
        if (this.left == d.getLeft())
            return -2;

        if (this.right == d.getRight())
            return 2;

        if (this.right == d.getLeft())
            return -1;

        if (this.left == d.getRight())
            return 1;

        return 0;
    }
}