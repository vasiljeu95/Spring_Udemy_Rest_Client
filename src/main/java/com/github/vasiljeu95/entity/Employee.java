package com.github.vasiljeu95.entity;

import lombok.Data;

/**
 * employee
 *
 * @author Stepan Vasilyeu
 * @since 08.09.2022
 */
@Data
public class Employee {

    private int id;
    private String name;
    private String surName;
    private String department;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String surName, String department, int salary) {
        this.name = name;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }

    public Employee(int id, String name, String surName, String department, int salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }
}
