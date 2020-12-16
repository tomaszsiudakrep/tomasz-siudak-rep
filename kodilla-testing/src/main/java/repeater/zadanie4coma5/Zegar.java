package repeater.zadanie4coma5;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

public class Zegar {

    public LocalTime time;


    public Zegar(int hour, int minute, int second) {
        this.time = LocalTime.of(hour, minute, second);
    }

    @Override
    public String toString() {
        return "Zegar{" +
                "time=" + time +
                '}';
    }
}
