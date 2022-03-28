package pro.sky.java.course2.homework13.model;

import java.util.Objects;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final int departmentId;
    private int salary;


    public Employee(String firstName, String lastName, int departmentId, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    @Override
    public String toString() {

        return "Сотрудник: " + lastName + " " + firstName + " " + departmentId + " " + salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentId == employee.departmentId && Float.compare(employee.salary, salary) == 0 && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, departmentId, salary);
    }
}

