package ru.top.employeeAccountingSystem;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class Method {
    //удаляем работника из мапы с работниками(увольняем)
    public static void dismissEmployee(Employee employee) {
        EmployeeRoster.employeeRoster.remove(employee.getName());
        System.out.println("Работник удалён из базы данных");
    }

    //изменять информацию о работнике
    public static void changeEmployeeInfo() {//берём работника из мапы, изменяем его и записываем в файл, потом достаём из файла и добавляем в мапу

        try (FileOutputStream outputStream = new FileOutputStream("C:\\Projects\\java214\\java-core\\src\\workers.txt")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            System.out.println("Введите фамилию, имя и отчество работника, чьи данные необходимо изменить:");
            Scanner scan = new Scanner(System.in);
            String employeeName = scan.nextLine();

            System.out.println("""
                    Выберите информацию для изменения:
                    1 - дату рождения
                    2 - пол
                    3 - телефонный номер
                    4 - должность
                    5 - отдел
                    6 - дату приёма на работу
                    7 - зарплату""");
//            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {//дата рождения
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Введите новые данные:");
                    LocalDate newData = LocalDate.parse(scan2.nextLine());
                    Method.getEmployee(EmployeeRoster.employeeRoster, employeeName).setBirthdate(newData);
                    Employee employee1 = EmployeeRoster.employeeRoster.get(employeeName);
                    EmployeeRoster.registrationEmployee(EmployeeRoster.employeeRoster, employee1);
                    objectOutputStream.writeObject(employee1);//старый работник с новыми данными записан в файл
                    objectOutputStream.close();
                }
                case 2 -> {//пол
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Введите новые данные:");
                    String newData = scan2.nextLine();
                    Method.getEmployee(EmployeeRoster.employeeRoster, employeeName).setSex(newData);
                    Employee employee1 = EmployeeRoster.employeeRoster.get(employeeName);
                    EmployeeRoster.registrationEmployee(EmployeeRoster.employeeRoster, employee1);
                    objectOutputStream.writeObject(employee1);//старый работник с новыми данными записан в файл
                    objectOutputStream.close();
                }
                case 3 -> {//тел номер
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Введите новые данные:");
                    String newData = scan2.nextLine();
                    Method.getEmployee(EmployeeRoster.employeeRoster, employeeName).setPhoneNumber(newData);
                    Employee employee1 = EmployeeRoster.employeeRoster.get(employeeName);
                    EmployeeRoster.registrationEmployee(EmployeeRoster.employeeRoster, employee1);
                    objectOutputStream.writeObject(employee1);//старый работник с новыми данными записан в файл
                    objectOutputStream.close();
                }
                case 4 -> {//должность
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Введите новые данные:");
                    String newData = scan2.nextLine();
                    Method.getEmployee(EmployeeRoster.employeeRoster, employeeName).setPost(newData);
                    Employee employee1 = EmployeeRoster.employeeRoster.get(employeeName);
                    EmployeeRoster.registrationEmployee(EmployeeRoster.employeeRoster, employee1);
                    objectOutputStream.writeObject(employee1);//старый работник с новыми данными записан в файл
                    objectOutputStream.close();
                }
                case 5 -> {//отдел
                    Scanner scan2 = new Scanner(System.in);//надо поменять и руководителя
                    System.out.println("Введите новые данные:");
                    String newData = scan2.nextLine();
                    Method.getEmployee(EmployeeRoster.employeeRoster, employeeName).setDepartment(newData);
                    String newChief = null;
                    if (newData.equalsIgnoreCase("Бухгалтерия")){
                        newChief = String.valueOf(DepartmentChief.Белова_Вероника_Сергеевна);
                    }
                    else if (newData.equalsIgnoreCase("Отдел кадров")){
                        newChief = String.valueOf(DepartmentChief.Николаева_Алиса_Тимофеевна);
                    }
                    else if (newData.equalsIgnoreCase("ИТ")){
                        newChief = String.valueOf(DepartmentChief.Иванов_Сергей_Анатольевич);
                    }
                    else if (newData.equalsIgnoreCase("Производство")){
                        newChief = String.valueOf(DepartmentChief.Сидоров_Александр_Петрович);
                    }
                    else {
                        newChief = String.valueOf(DepartmentChief.Петров_Николай_Иванович);
                    }

                    Method.getEmployee(EmployeeRoster.employeeRoster, employeeName).setChief(newChief);
                    Employee employee1 = EmployeeRoster.employeeRoster.get(employeeName);
                    EmployeeRoster.registrationEmployee(EmployeeRoster.employeeRoster, employee1);
                    objectOutputStream.writeObject(employee1);//старый работник с новыми данными записан в файл
                    objectOutputStream.close();
                }
                case 6 -> {//дата приёма на работу
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Введите новые данные:");
                    LocalDate newData = LocalDate.parse(scan2.nextLine());
                    Method.getEmployee(EmployeeRoster.employeeRoster, employeeName).setDateOfEmployment(newData);
                    Employee employee1 = EmployeeRoster.employeeRoster.get(employeeName);
                    EmployeeRoster.registrationEmployee(EmployeeRoster.employeeRoster, employee1);
                    objectOutputStream.writeObject(employee1);//старый работник с новыми данными записан в файл
                    objectOutputStream.close();
                }
                case 7 -> {//зарплата
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Введите новые данные:");
                    Double newData = scan2.nextDouble();
                    Method.getEmployee(EmployeeRoster.employeeRoster, employeeName).setSalary(newData);
                    Employee employee1 = EmployeeRoster.employeeRoster.get(employeeName);
                    EmployeeRoster.registrationEmployee(EmployeeRoster.employeeRoster, employee1);
                    objectOutputStream.writeObject(employee1);//старый работник с новыми данными записан в файл
                    objectOutputStream.close();
                }
                default -> System.out.println("Вы сделали неправильный выбор");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    //получить работника из мапы по ключу-имени
    public static Employee getEmployee(Map<String, Employee> map, String key) {
        return map.get(key);
    }
}