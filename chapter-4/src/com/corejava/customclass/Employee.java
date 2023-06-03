package com.corejava.customclass;
/**
 *  自己定义一个员工类 Employee
 */

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee() {
    }

    /**
     *  自己定义的一个构造方法
     * @param name
     * @param salary
     * @param year
     * @param month
     * @param day
     */
    public Employee(String name, double salary, int year ,int month,int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public Employee(String name, double salary, LocalDate birthday) {
        this.name = name;
        this.salary = salary;
        this.hireDay = birthday;
    }

    /**
     *  自己定义一个成员方法,用于员工工资调整
     * @return
     */
    public void raiseSalary(int byPercent){
        double raise = this.salary*byPercent/100;
        this.salary = this.salary + raise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }
}
