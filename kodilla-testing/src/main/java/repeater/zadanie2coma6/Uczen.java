package repeater.zadanie2coma6;

public class Uczen {

    String firstName;
    String lastName;
    int id;

    public Uczen(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
