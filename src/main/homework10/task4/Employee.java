package main.homework10.task4;

import java.util.Random;

public class Employee implements Generatable {
    private String surname;
    private String name;
    private Passport passport;
    private Double salary;

    public Double getSalary() {
        return salary;
    }

    @Override
    public Employee generate() {
        surname = "AutoL" + StringGenerator.generate(Property.EMPLOYEE_LASTNAME_LENGTH, Property.EMPLOYEE_NAME_PATTERN);
        name = "AutoF" + StringGenerator.generate(Property.EMPLOYEE_FIRSTNAME_LENGTH, Property.EMPLOYEE_NAME_PATTERN);
        passport = new Passport().generate();
        salary = new Random().nextDouble() * (Property.EMPLOYEE_SALARY_MAX - Property.EMPLOYEE_SALARY_MIN) + Property.EMPLOYEE_SALARY_MIN;
        // Округлим до копеек
        salary *= 100;
        salary = 1d * Math.round(salary) / 100;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s, %.2f", surname, name, passport, salary);
    }
}
