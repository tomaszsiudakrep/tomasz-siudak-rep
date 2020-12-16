package com.kodilla.testing.zadania2c6;

public class Student {

    Integer number;
    String name;
    String lastName;

    public Student(int number, String name, String lastName) {
        this.number = number;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (number != student.number) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return lastName != null ? lastName.equals(student.lastName) : student.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
