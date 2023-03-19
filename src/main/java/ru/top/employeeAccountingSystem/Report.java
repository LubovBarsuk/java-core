package ru.top.employeeAccountingSystem;

import java.util.Map;
import java.util.Scanner;

public class Report {

    //- поиск и вывод сотрудников
//        по фио, должности, отделу и начальнику
    public static void searchEmployee() {

        System.out.println("Выберите параметр для вывода сотрудников:\n1 - фамилия, имя, отчество\n2 - должность\n3 - отдел\n4 - руководитель отдела");
        Scanner scanner = new Scanner(System.in);
        int searchData = scanner.nextInt();
        switch (searchData) {
            case 1 -> {
                System.out.println("Введите фамилию, имя и отчество сотрудника:");
                Scanner scanner1 = new Scanner(System.in);
                String searchName = scanner1.nextLine();
                System.out.println(Method.getEmployee(EmployeeRoster.employeeRoster, searchName));
            }
            case 2 -> {
                System.out.println("Введите должность:");
                Scanner scanner1 = new Scanner(System.in);
                String searchPost = scanner1.nextLine();
                for (Map.Entry<String, Employee> entry : EmployeeRoster.employeeRoster.entrySet()) {
                    Employee employee = entry.getValue();
                    if (employee.getPost().equalsIgnoreCase(searchPost)) {
                        System.out.println(employee);
                    }
                }
            }
            case 3 -> {
                System.out.println("Введите отдел:");
                Scanner scanner1 = new Scanner(System.in);
                String searchDepartment = scanner1.nextLine();
                for (Map.Entry<String, Employee> entry : EmployeeRoster.employeeRoster.entrySet()) {
                    Employee employee = entry.getValue();
                    if (employee.getDepartment().equalsIgnoreCase(searchDepartment)) {
                        System.out.println(employee);
                    }
                }
            }
            case 4 -> {
                System.out.println("Введите руководителя:\nБелова_Вероника_Сергеевна\nНиколаева_Алиса_Тимофеевна\nИванов_Сергей_Анатольевич\nСидоров_Александр_Петрович\nПетров_Николай_Иванович");
                Scanner scanner1 = new Scanner(System.in);
                String searchChief = scanner1.nextLine();
                for (Map.Entry<String, Employee> entry : EmployeeRoster.employeeRoster.entrySet()) {
                    Employee employee = entry.getValue();
                    if (employee.getChief().equalsIgnoreCase(searchChief)) {
                        System.out.println(employee);
                    }
                }
            }
            default -> System.out.println("Неправильный выбор");
        }
    }
}
