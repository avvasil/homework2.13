package pro.sky.java.course2.homework13.services;

import pro.sky.java.course2.homework13.model.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeService {



    Employee addEmployee(String firstName, String lastName, int departmentId, int salary);

    Employee removeEmployee(String firstName, String lastName, int departmentId, int salary);

    Employee findEmployee(String firstName, String lastName, int departmentId, int salary);

    List<Employee> getListOfEmployees();
}
