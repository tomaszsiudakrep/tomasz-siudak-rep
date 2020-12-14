package com.kodilla.testing.average;

public class Tab {

    private double average;
    private int result = 0;
    public int [] grades = new int[20];
    private int firstGrade = 1;

    private int x = 10;
    private Integer y = 10;

    public void sumGrades() {

        for(int i = 0; i < grades.length; i++) {
            grades[i] = firstGrade;
            System.out.println("Element " + i + " = " + grades[i]);
            result += grades[i];
            firstGrade++;
        }
    }

  public void averageCheck() {
        average = result / grades.length;
        System.out.println("Average = " + average);

  }

  public void checkWrapper() {
        if(x == y) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
  }

}