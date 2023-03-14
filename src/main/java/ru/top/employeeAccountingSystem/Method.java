package ru.top.employeeAccountingSystem;

import java.util.Scanner;

public class Method {
    //удаляем работника из мапы с работниками(увольняем)
    public static void dismissEmployee(Employee employee) {
        EmployeeRoster.employeeRoster.remove(employee.getName());
    }

    //изменять информацию о работнике
    public static void changeEmployeeInfo (Employee employee){
        System.out.println("""
                Выберите информацию для изменения:
                1 - фамилию, имя и отчество
                2 - дату рождения
                3 - пол
                4 - телефонный номер
                5 - должность
                6 - отдел
                7 - дату приёма на работу
                8 - зарплату""");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice){
            case 1:

        }
    }

}
