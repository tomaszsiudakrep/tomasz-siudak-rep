package com.kodilla.testing.hashMapExercises;

public class Salary {
    private Double base;
    private Double bonus;

    public Salary(Double base, Double bonus) {
        this.base = base;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "base=" + base +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Salary salary = (Salary) o;

        if (base != null ? !base.equals(salary.base) : salary.base != null) return false;
        return bonus != null ? bonus.equals(salary.bonus) : salary.bonus == null;
    }

    @Override
    public int hashCode() {
        int result = base != null ? base.hashCode() : 0;
        result = 31 * result + (bonus != null ? bonus.hashCode() : 0);
        return result;
    }
}
