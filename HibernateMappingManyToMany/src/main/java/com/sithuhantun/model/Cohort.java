package com.sithuhantun.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="cohort")
public class Cohort implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private int cohortId;
    private String cohortName;
    private String duration;

    public Cohort() {
        super();
    }

    public Cohort(String cohortName, String duration) {
        super();
        this.cohortName = cohortName;
        this.duration = duration;
    }

    public int getCohortId() {
        return cohortId;
    }

    public void setCohortId(int cohortId) {
        this.cohortId = cohortId;
    }

    public String getCohortName() {
        return cohortName;
    }

    public void setCohortName(String cohortName) {
        this.cohortName = cohortName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
