import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Sortieren test = new Sortieren();
        int start = 25;
        int end = 150;
        ArrayList<Lieferant> lieferanten = new ArrayList<>();

        Stack s = new Stack();
        s.push("Erstes Element");
        s.push("Zweites Element");
        s.push("Drittes Element");

        while (true) {
            try {
                System.out.println(s.pop());
        } catch(EmptyStackException e){
            break;
        }
    }


        Random generator = new Random();

        Lieferant flo = new Lieferant("flo", generator.nextInt(end - start) + start);
        Lieferant jennifer = new Lieferant("jennifer", generator.nextInt(end - start) + start);
        Lieferant alex = new Lieferant("alex", generator.nextInt(end - start) + start);
        Lieferant jasmin = new Lieferant("jasmin", generator.nextInt(end - start) + start);

        lieferanten.add(flo);
        lieferanten.add(jennifer);
        lieferanten.add(alex);
        lieferanten.add(jasmin);

/*        Collections.sort(lieferanten, new SortGeschwindigkeit());

        for (Lieferant a : lieferanten) {
            System.out.println(a);
  */
        System.out.println(test.sortieren(lieferanten));
        ausgabe(lieferanten);
        }

    public static void ausgabe(ArrayList<Lieferant> lieferanten){
        Sortieren test = new Sortieren();
        test.sortieren(lieferanten);

        for (int i = 0; i < lieferanten.size() ; i++) {
            int p = i+1;
            System.out.println("Platz "+  p + ": "+ lieferanten.get(i).getName() + " , " + lieferanten.get(i).getGeschwindigkeit() + " km/h");
        }
   //     for (Lieferant schnellste:lieferanten) {
   //         System.out.println("Der Schnellste ist: " +schnellste.getName() + " mit einer Geschwindigkeit von " +schnellste.getGeschwindigkeit() + "km/h.");
        }
}




