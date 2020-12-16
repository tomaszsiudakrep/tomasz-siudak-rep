package repeater.ogolnie;

public class DaneUczniow {

    private String studentName;
    private Integer id;

    public DaneUczniow(String name, Integer id) {
        this.studentName = name;
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "DaneUczniow{" +
                "name='" + studentName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
