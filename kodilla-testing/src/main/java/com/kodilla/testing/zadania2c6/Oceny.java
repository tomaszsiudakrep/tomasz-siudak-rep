package com.kodilla.testing.zadania2c6;

public class Oceny {

    Double it;
    Double math;
    Double physics;
    Double astronomy;

    public Oceny(Double it, Double math, Double physics, Double astronomy) {
        this.it = it;
        this.math = math;
        this.physics = physics;
        this.astronomy = astronomy;
    }

    public Double average() {
        return (it + math + physics + astronomy) / 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oceny oceny = (Oceny) o;

        if (it != null ? !it.equals(oceny.it) : oceny.it != null) return false;
        if (math != null ? !math.equals(oceny.math) : oceny.math != null) return false;
        if (physics != null ? !physics.equals(oceny.physics) : oceny.physics != null) return false;
        return astronomy != null ? astronomy.equals(oceny.astronomy) : oceny.astronomy == null;
    }

    @Override
    public int hashCode() {
        int result = it != null ? it.hashCode() : 0;
        result = 31 * result + (math != null ? math.hashCode() : 0);
        result = 31 * result + (physics != null ? physics.hashCode() : 0);
        result = 31 * result + (astronomy != null ? astronomy.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Oceny{" +
                "it=" + it +
                ", math=" + math +
                ", physics=" + physics +
                ", astronomy=" + astronomy +
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

    public Double getAstronomy() {
        return astronomy;
    }
}
