package ru.top.employeeAccountingSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class LoginAndPasswordData {
    public static void main(String[] args) {

        Map<String, String> departmentChief = new HashMap<>();
        departmentChief.put("Бухгалтерия","Белова Вероника Сергеевна");
        departmentChief.put("Отдел кадров","Николаева Алиса Тимофеевна");
        departmentChief.put("ИТ","Иванов Сергей Анатольевич");
        departmentChief.put("Производство","Сидоров Александр Петрович");
        departmentChief.put("Администрация","Петров Николай Иванович");

        Map<String, String> loginAndPassword = new HashMap<>();
        loginAndPassword.put("IvanovSA", "15fgj2");
        loginAndPassword.put("PetrovNI", "5g4rg4");
        loginAndPassword.put("SidorovAP", "9y4h4h");
        loginAndPassword.put("NikolaevaAT", "7656rg");
        loginAndPassword.put("BelovaVS", "895yth");

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
        if(flag){

            //весь код

        }
    }
}