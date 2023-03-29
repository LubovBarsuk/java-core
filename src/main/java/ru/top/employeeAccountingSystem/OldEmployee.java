package ru.top.employeeAccountingSystem;

import java.time.LocalDate;

public class OldEmployee {
    public static void createOldEmployeeData(){

        LocalDate birthdateKIR = LocalDate.of(1990, 10, 11);
        LocalDate dateOfEmploymentKIR = LocalDate.of(2020, 6, 14);
        Employee kolesnikov = new Employee("Колесников Илья Романович", birthdateKIR, "м", "9189638521", "разработчик", "ИТ", String.valueOf(DepartmentChief.Иванов_Сергей_Анатольевич), dateOfEmploymentKIR, 150000.0);
        EmployeeRoster.employeeRoster.put("Колесников Илья Романович", kolesnikov);

        LocalDate birthdateBel = LocalDate.of(1992, 11, 12);
        LocalDate dateOfEmploymentBel = LocalDate.of(2021, 7, 16);
        Employee belova = new Employee("Белова Вероника Сергеевна", birthdateBel, "ж", "9187894561", "главный бухгалтер", "Бухгалтерия", String.valueOf(DepartmentChief.Белова_Вероника_Сергеевна), dateOfEmploymentBel, 50000.0);
        EmployeeRoster.employeeRoster.put("Белова Вероника Сергеевна", belova);

        LocalDate birthdateNik = LocalDate.of(1984, 12, 8);
        LocalDate dateOfEmploymentNik = LocalDate.of(2019, 5, 14);
        Employee nikolaeva = new Employee("Николаева Алиса Тимофеевна", birthdateNik, "ж", "9181234568", "начальник отдела кадров", "Отдел кадров", String.valueOf(DepartmentChief.Николаева_Алиса_Тимофеевна), dateOfEmploymentNik, 45000.0);
        EmployeeRoster.employeeRoster.put("Николаева Алиса Тимофеевна", nikolaeva);

        LocalDate birthdateIv = LocalDate.of(1989, 10, 22);
        LocalDate dateOfEmploymentIv = LocalDate.of(2018, 4, 19);
        Employee ivanov = new Employee("Иванов_Сергей_Анатольевич", birthdateIv, "м", "9181459658", "старший разработчик", "ИТ", String.valueOf(DepartmentChief.Иванов_Сергей_Анатольевич), dateOfEmploymentIv, 200000.0);
        EmployeeRoster.employeeRoster.put("Иванов_Сергей_Анатольевич", ivanov);

        LocalDate birthdateSid = LocalDate.of(1985, 11, 23);
        LocalDate dateOfEmploymentSid = LocalDate.of(2017, 3, 9);
        Employee sidorov = new Employee("Сидоров Александр Петрович", birthdateSid, "м", "9188794562", "старший инженер", "Производство", String.valueOf(DepartmentChief.Сидоров_Александр_Петрович), dateOfEmploymentSid, 150000.0);
        EmployeeRoster.employeeRoster.put("Сидоров Александр Петрович", sidorov);

        LocalDate birthdatePet = LocalDate.of(1990, 9, 5);
        LocalDate dateOfEmploymentPet = LocalDate.of(2018, 9, 4);
        Employee petrov = new Employee("Петров Николай Иванович", birthdatePet, "м", "9188745698", "директор", "Администрация", String.valueOf(DepartmentChief.Петров_Николай_Иванович), dateOfEmploymentPet, 250000.0);
        EmployeeRoster.employeeRoster.put("Петров Николай Иванович", petrov);

        LocalDate birthdateSok = LocalDate.of(1988, 1, 30);
        LocalDate dateOfEmploymentSok = LocalDate.of(2020, 7, 6);
        Employee sokolova = new Employee("Соколова Ирина Юрьевна", birthdateSok, "ж", "9189517538", "секретарь", "Администрация", String.valueOf(DepartmentChief.Петров_Николай_Иванович), dateOfEmploymentSok, 30000.0);
        EmployeeRoster.employeeRoster.put("Соколова Ирина Юрьевна", sokolova);

    }
}
