package com.kodilla.testing.module22;

public class SalaryParam {
    Double baseSalary;
    Double bonus;
    Double functionAddSalary;

    public SalaryParam(Double baseSalary, Double bonus, Double functionAddSalary) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.functionAddSalary = functionAddSalary;
    }

    @Override
    public String toString() {
        return "SalaryParam{" +
                "baseSalary=" + baseSalary +
                ", bonus=" + bonus +
                ", functionAddSalary=" + functionAddSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalaryParam that = (SalaryParam) o;

        if (baseSalary != null ? !baseSalary.equals(that.baseSalary) : that.baseSalary != null) return false;
        if (bonus != null ? !bonus.equals(that.bonus) : that.bonus != null) return false;
        return functionAddSalary != null ? functionAddSalary.equals(that.functionAddSalary) : that.functionAddSalary == null;
    }

    @Override
    public int hashCode() {
        int result = baseSalary != null ? baseSalary.hashCode() : 0;
        result = 31 * result + (bonus != null ? bonus.hashCode() : 0);
        result = 31 * result + (functionAddSalary != null ? functionAddSalary.hashCode() : 0);
        return result;
    }
}
