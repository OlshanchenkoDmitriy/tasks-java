package task1.entity;

import task1.exception.FieldLengthLimitException;
import task1.exception.IncorrectSalaryException;

public class Employee {

    private Integer id;

    private static Integer nextId = 1;

    //max length 32
    private String name;

    //max length 32
    private String surname;

    //more than 0
    private Double salary;

    public Employee(String name, String surname, Double salary)
            throws FieldLengthLimitException, IncorrectSalaryException {

        if(name.length() > 32) throw new FieldLengthLimitException("Incorrect name length, must be less then 32");
        if(surname.length() > 32) throw new FieldLengthLimitException("Incorrect surname length, must be less then 32");
        if(salary < 0) throw new IncorrectSalaryException("Incorrect salary, must be more or equals 0");
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public static Integer getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws FieldLengthLimitException {
        if(name.length() > 32) throw new FieldLengthLimitException("Incorrect name length, must be less then 32");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws FieldLengthLimitException {
        if(surname.length() > 32) throw new FieldLengthLimitException("Incorrect surname length, must be less then 32");
        this.surname = surname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) throws IncorrectSalaryException {
        if(salary < 0) throw new IncorrectSalaryException("Incorrect salary, must be more or equals 0");
        this.salary = salary;
    }
}
