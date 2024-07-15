package com.sithuhantun.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table
public class Teacher implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;
    private String teacherName;
    private String salary;

    public Teacher() {
        super();
    }

    public Teacher(String salary, String teacherName) {
        super();
        this.salary = salary;
        this.teacherName = teacherName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        teacherName = teacherName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
