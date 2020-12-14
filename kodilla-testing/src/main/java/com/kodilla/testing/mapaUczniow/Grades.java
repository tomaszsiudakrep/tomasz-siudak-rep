package com.kodilla.testing.mapaUczniow;

public class Grades {
    public Double it;
    public Double math;
    public Double physics;
    public double averageFinal;

    public Grades(Double IT, Double math, Double physics) {
        this.it = IT;
        this.math = math;
        this.physics = physics;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grades grades = (Grades) o;

        if (Double.compare(grades.averageFinal, averageFinal) != 0) return false;
        if (it != null ? !it.equals(grades.it) : grades.it != null) return false;
        if (math != null ? !math.equals(grades.math) : grades.math != null) return false;
        return physics != null ? physics.equals(grades.physics) : grades.physics == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = it != null ? it.hashCode() : 0;
        result = 31 * result + (math != null ? math.hashCode() : 0);
        result = 31 * result + (physics != null ? physics.hashCode() : 0);
        temp = Double.doubleToLongBits(averageFinal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "it=" + it +
                ", math=" + math +
                ", physics=" + physics +
                ", average=" + averageFinal +
                '}';
    }

    public Double getIt() {
        return it;
    }

    public Double getMath() {
        return math;
    }

    public Double getPhysics() {
        return physics;
    }

    public double getAverage() {
        return averageFinal;
    }

    //public Double average(Double IT, Double Math, Double Physics) {
    //    return (this.IT + this.Math + this.Physics) / 3;
    //}

    public void average() {
      averageFinal = (this.it + this.math + this.physics) / 3;
      System.out.println(averageFinal);
    }
}
