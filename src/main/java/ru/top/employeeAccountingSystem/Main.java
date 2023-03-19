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

        - отчёт по структуре организации
        инфа об отделах и их начальниках

        - отчёт по средней зарплате
         по организации и по отделам

        - топ10 самых дорогих сотрудников по зарплате
        сотрировка по зарплате

        - топ10 самых преданных сотрудников
        по количеству лет в организации
        здесь будем вычитать даты

        Всё это читаем из файлов, отчёты пишем в файлы, поиск и вывод сотрудников показываем в консоли

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

            //весь код

            System.out.println("Введите:\n1 - нанять нового сотрудника\n2 - уволить сотрудника\n3 - поменять данные сотрудника\n4 - показать сотрудников по фамилии, отделу, должности, руководителю");
            Scanner scanner1 = new Scanner(System.in);
            int choice = scanner1.nextInt();
            switch (choice) {
                case 1:
                    Recruiter.hireEmployee();
                    System.out.println(EmployeeRoster.employeeRoster);
                    break;
                case 2:
                    System.out.println("Введите ФИО увольняемого сотрудника:");
                    Scanner scanner2 = new Scanner(System.in);
                    String employeeName = scanner2.nextLine();
                    Method.dismissEmployee(EmployeeRoster.employeeRoster.get(employeeName));
                    System.out.println(EmployeeRoster.employeeRoster);
                    break;
                case 3:
                    Method.changeEmployeeInfo();
                    break;
                case 4:
                    Report.searchEmployee();
                    break;
                default:
                    System.out.println("Введите 1");
            }


        }
    }
}

