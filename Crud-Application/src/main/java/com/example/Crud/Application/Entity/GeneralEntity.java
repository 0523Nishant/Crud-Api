package com.example.Crud.Application.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="api")
public class GeneralEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="emp_id")
    private int id;
    @Column(name ="emp_name")
    private String emp_name;
    @Column(name ="emp_salary")
    private Float salary;
    @Column(name ="emp_age")
    private int age;
    @Column(name ="emp_city")
    private String emp_city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmp_city() {
        return emp_city;
    }

    public void setEmp_city(String emp_city) {
        this.emp_city = emp_city;
    }

    @Override
    public String toString() {
        return "GeneralEntity{" +
                "id=" + id +
                ", emp_name='" + emp_name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", emp_city='" + emp_city + '\'' +
                '}';
    }

    public GeneralEntity(){

    }

}
