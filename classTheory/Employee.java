package classTheory;

import java.time.*;

/**
 * This program tests the Employee class.
 *
 * @version 1.13 2018-04-10
 * @author Cay Horstmann
 */
class Employee {

    private String name;
    private double salary;
    private double hours;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getHours() {
        return hours;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void logHours(double addHours) {
        hours += addHours;
    }

}
