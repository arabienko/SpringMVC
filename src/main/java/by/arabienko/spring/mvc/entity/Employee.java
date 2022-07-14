package by.arabienko.spring.mvc.entity;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String name;

    private String surname;

    private int salary;

    private String department;

    private Map<String, String> departments;

    private String car;

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
