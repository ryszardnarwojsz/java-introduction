package pl.futurecollars.lesson5.task4;

import java.math.BigDecimal;

public class Employee {

    public static final String WHITE_SPACE = " ";
    private final String name;
    private final String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age, BigDecimal value) {
        this.name = name;
        this.age = age;
        this.baseSalary = value;
        this.surname = surname;
    }

    public Employee(String name, int age, BigDecimal value1, BigDecimal value2, String surname) {
        this.name = name;
        this.age = age;
        this.baseSalary = value1;
        this.bonus = value2;
        this.surname = surname;
    }

    public String getEmployeeDescription() {
        return "Employee name : " + name + WHITE_SPACE + surname;
    }

    public String getEmployeeDescriptionWithAge() {
        return "Employee details : " + name + WHITE_SPACE + surname + " is " + age;
    }

    // Method is used to get total  salary
    public BigDecimal getTotalSalary() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

}
