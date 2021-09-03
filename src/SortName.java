import java.util.Comparator;

public class SortName implements Comparator <Lieferant> {

    @Override
        public int compare(Lieferant a1, Lieferant a2) {
            return a1.getName().compareTo(a2.getName());
        }
}
