package com.sithuhantun.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Department implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deptId;
    private String deptName;

    @OneToMany(targetEntity = Teacher.class, cascade = {CascadeType.ALL})
    private List<Teacher> teacherList;

    public Department() {
        super();
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
