package com.kodilla.testing.module22;

public class Employee {
    String firstName;
    String lastName;
    String peselId;

    public Employee(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
        return peselId != null ? peselId.equals(employee.peselId) : employee.peselId == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (peselId != null ? peselId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }
}
