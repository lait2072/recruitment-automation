package com.team13.recruitmentautomation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vacancyCandidate")
public class VacancyCandidate {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "urlSource")
    private String urlSource;

    @ManyToOne
    @JoinColumn(name = "vacancy_id", referencedColumnName = "id")
    private Vacancy nameVacancy;

    @ManyToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
    private Candidate nameCandidate;

    public VacancyCandidate() {
    }

    public VacancyCandidate(String fullName, String urlSource) {
        this.fullName = fullName;
        this.urlSource = urlSource;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUrlSource() {
        return urlSource;
    }

    public void setUrlSource(String urlSource) {
        this.urlSource = urlSource;
    }

    public Vacancy getNameVacancy() {
        return nameVacancy;
    }

    public void setNameVacancy(Vacancy nameVacancy) {
        this.nameVacancy = nameVacancy;
    }

    public Candidate getNameCandidate() {
        return nameCandidate;
    }

    public void setNameCandidate(Candidate nameCandidate) {
        this.nameCandidate = nameCandidate;
    }

    @Override
    public String toString() {
        return "VacancyCandidate{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", urlSource='" + urlSource + '\'' +
                ", nameVacancy=" + nameVacancy +
                ", nameCandidate=" + nameCandidate +
                '}';
    }
}
