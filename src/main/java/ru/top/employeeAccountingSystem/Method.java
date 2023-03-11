package ru.top.employeeAccountingSystem;

public class Method {
    //удаляем работника из мапы с работниками(увольняем)
    public static void dismissEmployee(Employee employee){
        EmployeeRoster.employeeRoster.remove(employee.getName());
    }


}
