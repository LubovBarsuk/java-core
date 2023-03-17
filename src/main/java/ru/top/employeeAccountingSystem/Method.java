package ru.top.employeeAccountingSystem;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;

public class Method {
    //удаляем работника из мапы с работниками(увольняем)
    public static void dismissEmployee(Employee employee) {
        EmployeeRoster.employeeRoster.remove(employee.getName());
    }

    //изменять информацию о работнике
    public static void changeEmployeeInfo(Employee employee) {//берём работника из мапы, изменяем его и записываем в файл, потом достаём из файла и добавляем в мапу

        try (FileOutputStream outputStream = new FileOutputStream("C:\\Projects\\java214\\java-core\\src\\workers.txt")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

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
            switch (choice) {
                case 1:
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Введите фамилию, имя и отчество сотрудника:");
                    String oldName = scan2.nextLine();
                    System.out.println("Введите новые фамилию, имя и отчество сотрудника:");
                    String newName = scan2.nextLine();
//                    objectOutputStream.writeObject(Method.getEmployee(EmployeeRoster.employeeRoster, oldName).setName(newName));//старый работник с новым именем
//                    objectOutputStream.close();
//


                    // EmployeeRoster.employeeRoster.replace(oldName, )

            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
    //получить работника из мапы по ключу-имени
    public static Employee getEmployee(Map map, String key){
        Employee employee = (Employee) map.get(key);
        return employee;
    }
}