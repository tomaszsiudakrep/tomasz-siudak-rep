package com.kodilla.testing.hashMapExercises;

public class Employee {

    private String name;
    private String peselId;

    public Employee(String name, String peselId) {
        this.name = name;
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return peselId != null ? peselId.equals(employee.peselId) : employee.peselId == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (peselId != null ? peselId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }
}

