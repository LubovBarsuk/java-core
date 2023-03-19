package ru.top.employeeAccountingSystem;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRoster {

    static Map<String, Employee> employeeRoster = new HashMap<>();

    public static void registrationEmployee(Map<String, Employee> employeeRoster, Employee employee) {
        employeeRoster.put(employee.getName(), employee);
    }
}
