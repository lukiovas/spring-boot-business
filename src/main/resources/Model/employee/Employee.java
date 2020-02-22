package Model.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    double salary;
    private String position;
    private int age;
    private int dateOfEmployment;
    boolean onATask = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(int dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isOnATask() {
        return onATask;
    }

    public void setOnATask(boolean onATask) {
        this.onATask = onATask;
    }

    public Employee() {
    }

    public Employee(String name, String surname, double salary, String position, int age, int dateOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.position = position;
        this.age = age;
        this.dateOfEmployment = dateOfEmployment;
    }
}

