package com.team13.recruitmentautomation.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "respond")
public class Respond {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "numberRespond")
    private long numberRespond;

    @ManyToOne
    @JoinColumn(name = "vacancy_id", referencedColumnName = "id")
    private Vacancy jobVacancy;

    public Respond() {
    }

    public Respond(long numberRespond) {
        this.numberRespond = numberRespond;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumberRespond() {
        return numberRespond;
    }

    public void setNumberRespond(long numberRespond) {
        this.numberRespond = numberRespond;
    }

    public Vacancy getVacancy() {
        return jobVacancy;
    }

    public void setVacancy(Vacancy jobVacancy) {
        this.jobVacancy = jobVacancy;
    }

    @Override
    public String toString() {
        return "Respond{" +
                "id=" + id +
                ", numberRespond=" + numberRespond +
                ", jobVacancy=" + jobVacancy +
                '}';
    }
}
