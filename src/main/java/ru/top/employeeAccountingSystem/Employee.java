package ru.top.employeeAccountingSystem;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Serializable {

    @Serial
    private static final long serialVersionUID = 5443952939914818170L;
    private String name;
    private LocalDate birthdate;
    private String sex;
    private String phoneNumber;
    private String post;
    private String department;
    private String chief;
    private LocalDate dateOfEmployment;
    private Double salary;

    public Employee(String name, LocalDate birthdate, String sex, String phoneNumber, String post, String department, String chief, LocalDate dateOfEmployment, Double salary) {
        this.name = name;
        this.birthdate = birthdate;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.post = post;
        this.department = department;
        this.chief = chief;
        this.dateOfEmployment = dateOfEmployment;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(birthdate, employee.birthdate) && Objects.equals(sex, employee.sex) && Objects.equals(phoneNumber, employee.phoneNumber) && Objects.equals(post, employee.post) && Objects.equals(department, employee.department) && Objects.equals(chief, employee.chief) && Objects.equals(dateOfEmployment, employee.dateOfEmployment) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthdate, sex, phoneNumber, post, department, chief, dateOfEmployment, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", post='" + post + '\'' +
                ", department='" + department + '\'' +
                ", chief='" + chief + '\'' +
                ", dateOfEmployment=" + dateOfEmployment +
                ", salary=" + salary +
                '}';
    }
}
