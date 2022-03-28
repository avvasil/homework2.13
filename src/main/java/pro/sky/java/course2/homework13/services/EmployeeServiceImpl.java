package pro.sky.java.course2.homework13.services;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homework13.exceptions.EmployeeAlreadyExistsException;
import pro.sky.java.course2.homework13.exceptions.EmployeeNotFoundException;
import pro.sky.java.course2.homework13.model.Employee;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private Map<String, Employee> employeesMap = new HashMap<String, Employee>();

    @Override
    public List<Employee> getListOfEmployees() {
        return new ArrayList<>(employeesMap.values());
    }

    @Override
    public Employee addEmployee(String firstName, String lastName, int departmentId, int salary) {
        Employee addingEmployee = new Employee(firstName, lastName, departmentId, salary);
        String key = firstName + lastName;
        if (employeesMap.containsKey(key)) {
            throw new EmployeeAlreadyExistsException("Этот работник уже добавлен");
        }
        employeesMap.put(key, addingEmployee);
        return addingEmployee;
    }

    @Override
    public Employee removeEmployee(String firstName, String lastName, int departmentId, int salary) {
        String key = firstName + lastName;
        if (!employeesMap.containsKey(key)) {
            throw new EmployeeNotFoundException("Сотрудник не найден.");
        }
        return employeesMap.remove(key);
    }

    @Override
    public Employee findEmployee(String firstName, String lastName, int departmentId, int salary) {
        String key = firstName + lastName;
        if (!employeesMap.containsKey(key)) {
            throw new EmployeeNotFoundException("Сотрудник не найден.");
        }
        return employeesMap.get(key);
    }

}