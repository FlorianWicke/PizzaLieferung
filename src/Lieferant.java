public class Lieferant implements Comparable<Lieferant>{

    private String name;

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    private int geschwindigkeit;

    public Lieferant(String name, int geschwindigkeit){
        this.name = name;
        this.geschwindigkeit = geschwindigkeit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name + " (" + this.geschwindigkeit + ")";
    }

    @Override
    public int compareTo(Lieferant lieferant) {
        return this.name.compareTo(lieferant.getName());
    }
}
