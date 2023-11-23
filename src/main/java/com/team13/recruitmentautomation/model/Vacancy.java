package com.team13.recruitmentautomation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "vacancy")
public class Vacancy {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "Поле телефон дожно быть заполнено")
    @Size(min = 6, max = 50)
    @Column(name = "nameVacancy", nullable = false)
    private String nameVacancy;

    @Column(name = "numberDeclaration", nullable = false)
    private long numberDeclaration;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client nameClient;

    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "id")
    private Status newStatus;

    @OneToMany(mappedBy = "jobVacancy")
    private List<Respond> responds;

    @OneToMany(mappedBy = "nameVacancy")
    private List<VacancyCandidate> jobSources;

    public Vacancy() {
    }

    public Vacancy(String nameVacancy, long numberDeclaration, String urlSources) {
        this.nameVacancy = nameVacancy;
        this.numberDeclaration = numberDeclaration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameVacancy() {
        return nameVacancy;
    }

    public void setNameVacancy(String nameVacancy) {
        this.nameVacancy = nameVacancy;
    }

    public long getNumberDeclaration() {
        return numberDeclaration;
    }

    public void setNumberDeclaration(long numberDeclaration) {
        this.numberDeclaration = numberDeclaration;
    }

    public Client getNameClient() {
        return nameClient;
    }

    public void setNameClient(Client nameClient) {
        this.nameClient = nameClient;
    }

    public Status getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Status newStatus) {
        this.newStatus = newStatus;
    }

    public List<Respond> getResponds() {
        return responds;
    }

    public void setResponds(List<Respond> responds) {
        this.responds = responds;
    }

    public List<VacancyCandidate> getJobSources() {
        return jobSources;
    }

    public void setJobSources(List<VacancyCandidate> jobSources) {
        this.jobSources = jobSources;
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "id=" + id +
                ", nameVacancy='" + nameVacancy + '\'' +
                ", numberDeclaration=" + numberDeclaration +
                ", nameClient=" + nameClient +
                ", newStatus=" + newStatus +
                ", responds=" + responds +
                ", jobSources=" + jobSources +
                '}';
    }
}
