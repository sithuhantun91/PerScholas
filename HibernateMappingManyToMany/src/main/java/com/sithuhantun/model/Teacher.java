package com.sithuhantun.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Teacher")
public class Teacher implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;
    private String salary;
    private String teacherName;
    @ManyToMany(targetEntity = Cohort.class)
    private Set<Cohort> cohort;

    public Teacher() {
        super();
    }

    public Teacher(String salary, String teacherName) {
        super();
        this.salary = salary;
        this.teacherName = teacherName;
    }

    public Teacher(String salary, String teacherName, Set<Cohort> cohort) {
        super();
        this.salary = salary;
        this.teacherName = teacherName;
        this.cohort = cohort;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Set<Cohort> getCohort() {
        return cohort;
    }

    public void setCohort(Set<Cohort> cohort) {
        this.cohort = cohort;
    }
}
