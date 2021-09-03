import java.util.ArrayList;

public class Sortieren {
    Lieferant k;
    Lieferant l;
    ArrayList<Lieferant> lieferantenSort = new ArrayList<>();

    public ArrayList<Lieferant> sortieren(ArrayList<Lieferant> lieferanten){
        for (int i = 0; i < lieferanten.size() - 1; i++) {
            if (lieferanten.get(i).getGeschwindigkeit() > lieferanten.get(i + 1).getGeschwindigkeit()) {
                continue;
            }
            k = lieferanten.get(i);
            lieferanten.set(i, lieferanten.get(i+1));
            lieferanten.set(i+1, k);
            sortieren(lieferanten);
        }
        return lieferanten;
    }
}
