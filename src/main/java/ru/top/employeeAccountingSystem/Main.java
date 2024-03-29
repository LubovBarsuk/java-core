package ru.top.employeeAccountingSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Методы:

        - начало работы вход по логину и паролю           - есть
        есть база (мапа) с логинами и паролями,
        при входе требуем и проверяем

         - принимать на работу новых сотрудников
         метод, который создаёт новый объект класса работник и записывает в файл   -есть
        принимает данные. такие как фио, зарплата и пр поля
        вводим отдел, а начальник отдела добавляется из энама сам
        работники записываются в мапу, при увольнении удаляются

        - увольнять сотрудников                                 -есть
        метод удаляет сотрудника из мапы с работниками

        - изменять информацию о сотрудниках                         -есть
        метод спрашивает, у какого сотрудника надо что-то менять,
        что именно надо изменить и перезаписывает в файле

        - поиск и вывод сотрудников                            -есть
        по фио, должности, отделу и начальнику

        - отчёт по структуре организации                      -есть
        инфа об отделах и их начальниках

        - отчёт по средней зарплате                    -только по организации
         по организации и по отделам

        - топ10 самых дорогих сотрудников по зарплате
        сотрировка по зарплате

        - топ10 самых преданных сотрудников
        по количеству лет в организации
        здесь будем вычитать даты

        отчёты пишем в файлы, поиск и вывод сотрудников показываем в консоли

         */

        Map<String, String> loginAndPassword = new HashMap<>(); //загружаем базу логинов и паролей
        LoginAndPasswordData.createLoginAndPasswordTable(loginAndPassword);

        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        boolean flag = false;
        if (loginAndPassword.containsKey(login)) {
            System.out.println("Введите пароль:");
            String password = scanner.nextLine();
            if (Objects.equals(password, loginAndPassword.get(login))) {
                flag = true;
            } else {
                System.out.println("Неправильный пароль");
            }
        } else {
            System.out.println("Неправильный логин");
        }
        while (flag) {

            OldEmployee.createOldEmployeeData();
            menu();
        }
    }

    private static void menu() {
        System.out.println("""
                Введите:
                1 - нанять нового сотрудника
                2 - уволить сотрудника
                3 - поменять данные сотрудника
                4 - показать сотрудников по фамилии, отделу, должности, руководителю
                5 - создать отчёт по отделам и руководителям
                6 - создать отчёт по средней зарплате
                7 - показать список всех работников""");
        Scanner scanner1 = new Scanner(System.in);
        int choice = scanner1.nextInt();
        switch (choice) {
            case 1 -> Recruiter.hireEmployee();
            case 2 -> {
                System.out.println("Введите ФИО увольняемого сотрудника:");
                Scanner scanner2 = new Scanner(System.in);
                String employeeName = scanner2.nextLine();
                Method.dismissEmployee(EmployeeRoster.employeeRoster.get(employeeName));
            }
            case 3 -> {
                Method.changeEmployeeInfo();
                menu();
            }
            case 4 -> {
                Report.searchEmployee();
                menu();
            }
            case 5 -> {
                Report.showDepartmentInfo();
                menu();
            }
            case 6 -> {
                Report.showAverageSalary();
                menu();
            }
            case 7 -> System.out.println(EmployeeRoster.employeeRoster);
            default -> menu();
        }
    }
}

