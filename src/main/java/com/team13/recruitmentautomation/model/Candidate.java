package com.team13.recruitmentautomation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "candidate")
public class Candidate {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 2, max = 30, message = "Имя должно быть не меньше 2 и не больше 30 символов")
    @NotEmpty(message = "Поле имя дожно быть заполнено")
    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Size(min = 2, max = 30, message = "Фамилия должно быть не меньше 2 и не больше 30 символов")
    @NotEmpty(message = "Поле фамилия дожно быть заполнено")
    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Size(min = 2, max = 100, message = "Имя файла резюме должно быть не меньше 2 символов")
    @NotEmpty(message = "Поле имя файла резюме дожно быть заполнено")
    @Column(name = "fileName", nullable = false)
    private String fileNameResume;

    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "id")
    private Status statusCandidate;

    public Candidate() {
    }

    public Candidate(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Status getStatusCandidate() {
        return statusCandidate;
    }

    public void setStatusCandidate(Status statusCandidate) {
        this.statusCandidate = statusCandidate;
    }

    public String getFileNameResume() {
        return fileNameResume;
    }

    public void setFileNameResume(String fileNameResume) {
        this.fileNameResume = fileNameResume;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", fileNameResume='" + fileNameResume + '\'' +
                ", statusCandidate=" + statusCandidate +
                '}';
    }
}
