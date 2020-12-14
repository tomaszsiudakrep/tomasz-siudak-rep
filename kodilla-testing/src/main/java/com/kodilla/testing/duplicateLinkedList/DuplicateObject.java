package com.kodilla.testing.duplicateLinkedList;

public class DuplicateObject {
    int value = 0;

    public DuplicateObject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DuplicateObject that = (DuplicateObject) o;

        return value == that.value;
    }


}
