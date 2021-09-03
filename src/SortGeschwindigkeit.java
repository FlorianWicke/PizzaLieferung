import java.util.Comparator;

public class SortGeschwindigkeit implements Comparator<Lieferant> {
    @Override
    public int compare(Lieferant a1, Lieferant a2) {
        return a2.getGeschwindigkeit() - a1.getGeschwindigkeit();
    }
}
