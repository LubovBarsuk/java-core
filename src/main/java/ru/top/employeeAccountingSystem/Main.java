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

        - увольнять сотрудников
        метод удаляет сотрудника из мапы с работниками

        - изменять информацию о сотрудниках
        метод спрашивает, у какого сотрудника надо что-то менять,
        что именно надо изменить и перезаписывает в файле

        - поиск и вывод сотрудников
        по фио, должности, отделу и начальнику

        - отчёт по структуре организации
        инфа об отделах и их начальниках

        - отчётпо средней зарплате
         по организации и по отделам

        - топ10 самых дорогих сотрудников по зарплате
        сотрировка по зарплате

        - топ10 самых преданных сутрудников
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
        if (flag) {

            //весь код

            System.out.println("Чтобы принять на работу нового сотрудника введите 1");
            Scanner scanner1 = new Scanner(System.in);
            int choise = scanner1.nextInt();
            switch (choise) {
                case 1:
                    Recruiter.hireEmployee();
                    break;
                default:
                    System.out.println("Введите 1");
            }

            System.out.println(EmployeeRoster.employeeRoster);
        }
    }
}

