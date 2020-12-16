package repeater.zadanie4coma4;

public class Armata {

    public boolean loaded;
    public String numberOfCannon;

    public Armata(boolean loaded, String numberOfCannon) {
        this.loaded = loaded;
        this.numberOfCannon = numberOfCannon;
    }

    public void fire() {
        System.out.println("Fire fire fire");
    }

    public void procesStrzalu() {
        if(loaded) {
            this.fire();
        } else {
            System.out.println("Brak kuli");
            loaded = true;
            System.out.println("Kula załadowana");
            this.fire();
        }
    }

    public boolean isLoaded() {
        return loaded;
    }

    public String getNumberOfCannon() {
        return numberOfCannon;
    }
}
