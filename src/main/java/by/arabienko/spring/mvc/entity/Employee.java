package by.arabienko.spring.mvc.entity;

import by.arabienko.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "must be not less than two symbols...")
    private String name;

//    @NotNull(message = "field must be not empty... surname is required field.")
//    @NotEmpty(message = "field must be not empty... surname is required field.")
    @NotBlank(message = "field must be not empty... surname is required field.")  //equals @NotEmpty, but without spaces
    private String surname;

    @Min(value = 500,
            message = "salary must be more than 499...")
    @Max(value = 1000,
            message = "salary must be less than 1001...")
    private int salary;

    private String department;

    private Map<String, String> departments;

    private String car;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}",
            message = "please use pattern: xxx-xx-xx")
    private String numberPhone;

    @CheckEmail(value = "tut.by", message = "tut.by")
    private String email;

    private Map<String, String> cars;

    private String[] languages;

    private Map<String, String> langMap;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("SD", "Sales Department");

        cars = new HashMap<>();
        cars.put("BMV1", "BMV1");
        cars.put("Mercedes1", "MC1");
        cars.put("IMG1", "IMG1");

        langMap = new HashMap<>();
        langMap.put("English", "EN");
        langMap.put("Belorussian", "BLR");
        langMap.put("French", "FR");
    }

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("SD", "Sales Department");

        cars = new HashMap<>();
        cars.put("BMV1", "BMV1");
        cars.put("Mercedes1", "MC1");
        cars.put("IMG1", "IMG1");

        langMap = new HashMap<>();
        langMap.put("English", "EN");
        langMap.put("Belorussian", "BLR");
        langMap.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }


    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }


    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLangMap() {
        return langMap;
    }

    public void setLangMap(Map<String, String> langMap) {
        this.langMap = langMap;
    }


    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
