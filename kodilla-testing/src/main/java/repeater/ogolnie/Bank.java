package repeater.ogolnie;

public class Bank extends Abstrakcja{

    public Bank(Metody metody) {
        super(metody);
    }

    @Override
    protected void bank() {
        System.out.println("Trwa kontakt z bankiem");
    }
}
