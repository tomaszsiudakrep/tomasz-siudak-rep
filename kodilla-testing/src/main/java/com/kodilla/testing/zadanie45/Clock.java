package com.kodilla.testing.zadanie45;

import java.time.LocalTime;

public class Clock {

    LocalTime time;

    public Clock(int hours, int minute, int second) {
       this.time = LocalTime.of(hours, minute, second);
    }

        public void addOneMinute(){
            time = time.plusMinutes(1);
        }

    @Override
    public String toString() {
        return "Clock{" +
                "time=" + time +
                '}';
    }
}
