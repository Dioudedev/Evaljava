import java.util.ArrayList;
import java.util.Collections;

public class EnsembleDom {

    private ArrayList<Domino> ensemble;

    public EnsembleDom() {
        ensemble = new ArrayList<>();
    }

    public void add(Domino d) {
        ensemble.add(d);
    }

    public boolean isEmpty() {
        return ensemble.isEmpty();
    }
    public Domino remove() {
        if (!ensemble.isEmpty()) {
            return ensemble.remove(ensemble.size() - 1);
        } else {
            return null;
        }
    }

    public Domino remove(int i) {
        if (i >= 0 && i < ensemble.size()) {
            return ensemble.remove(i);
        } else {
            return null;
        }
    }

    public void consTotal() {
        ensemble.clear();
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                ensemble.add(new Domino(i, j));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Domino d : ensemble) {
            sb.append(d.toString()).append(" ");
        }
        return sb.toString().trim();
    }

    public int taille() {
        return ensemble.size();
    }

    public int getLeft() {
        if (!ensemble.isEmpty()) {
            return ensemble.get(0).getLeft();
        } else {
            return -1;
        }
    }

    public int getRight() {
        if (!ensemble.isEmpty()) {
            return ensemble.get(ensemble.size() - 1).getRight();
        } else {
            return -1;
        }
    }

    public void melanger() {
        Collections.shuffle(ensemble);
    }
}