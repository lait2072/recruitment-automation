package com.team13.recruitmentautomation.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "dateBegin")
    private LocalDate dateBegin;

    @Column(name = "dateEnd")
    private LocalDate dateEnd;

    @Column(name = "nameStatus")
    private  String nameStatus;

    @OneToMany(mappedBy = "newStatus")
    private List<Vacancy> vacancies;

    @OneToMany(mappedBy = "statusCandidate")
    private List<Candidate> candidates;

    public Status() {
    }

    public Status(LocalDate dateBegin, LocalDate dateEnd, String nameStatus) {
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.nameStatus = nameStatus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(LocalDate dateBegin) {
        this.dateBegin = dateBegin;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getNameStatus() {
        return nameStatus;
    }

    public void setNameStatus(String nameStatus) {
        this.nameStatus = nameStatus;
    }

    public List<Vacancy> getVacancies() {
        return vacancies;
    }

    public void setVacancies(List<Vacancy> vacancies) {
        this.vacancies = vacancies;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", dateBegin=" + dateBegin +
                ", dateEnd=" + dateEnd +
                ", nameStatus='" + nameStatus + '\'' +
                ", vacancies=" + vacancies +
                ", candidates=" + candidates +
                '}';
    }
}
