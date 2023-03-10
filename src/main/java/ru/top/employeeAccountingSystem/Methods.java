package ru.top.employeeAccountingSystem;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Methods {

    //создаём сотрудника
    public static Employee hireEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию, имя и отчество сотрудника:");
        String newName = scanner.nextLine();
        System.out.println("Введите дату рождения сотрудника(гггг-мм-дд):");
        LocalDate newBirthdate = LocalDate.parse(scanner.nextLine());
        System.out.println("Введите пол сотрудника (f/m):");
        String newSex = scanner.nextLine();
        System.out.println("Введите телефонный номер сотрудника(10 цифр):");
        String newPhoneNumber = scanner.nextLine();
        System.out.println("Введите должность:");
        String newPost = scanner.nextLine();
        System.out.println("Введите название отдела(Бухгалтерия, Отдел кадров, ИТ, Производство, Администрация):");
        String newDepartment = scanner.nextLine();
        System.out.println("Введите дату приёма на работу(гггг-мм-дд):");
        LocalDate newDateOfEmployment = LocalDate.parse(scanner.nextLine());
        System.out.println("Введите зарплату сотрудника:");
        Double newSalary = scanner.nextDouble();

        String newChief = switch (newDepartment) {
            case "Бухгалтерия" -> String.valueOf(DepartmentChief.Белова_Вероника_Сергеевна);
            case "Отдел кадров" -> String.valueOf(DepartmentChief.Николаева_Алиса_Тимофеевна);
            case "ИТ" -> String.valueOf(DepartmentChief.Иванов_Сергей_Анатольевич);
            case "Производство" -> String.valueOf(DepartmentChief.Сидоров_Александр_Петрович);
            case "Администрация" -> String.valueOf(DepartmentChief.Петров_Николай_Иванович);
            default -> "";
        };

        return new Employee(newName, newBirthdate, newSex, newPhoneNumber, newPost, newDepartment, newChief, newDateOfEmployment, newSalary);
    }

    //записывает нового работника в файл, вызывая метод создания нового работника
    public static void writheToFile() {
        try (FileOutputStream outputStream = new FileOutputStream("C:\\Projects\\java214\\java-core\\src\\workers.txt")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(hireEmployee()); //создаём нового работника и сразу записываем в файл
            objectOutputStream.close();

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }





    // EmployeeRoster.registrationEmployee(EmployeeRoster.employeeRoster, ??????????);//добавляем созданного работника в мапу со всеми работниками
    //как его сюда засунуть?????
    //считывать из файла, чтобы засунуть в мапу???????

}
