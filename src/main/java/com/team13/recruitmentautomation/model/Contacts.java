package com.team13.recruitmentautomation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "contacts")
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @NotEmpty(message = "Поле телефон дожно быть заполнено")
    private String telephone;

    @Column(nullable = false)
    @NotEmpty(message = "Поле email дожно быть заполнено")
    @Email(message = "Email должен быть достоверный")
    private String email;

    @ManyToOne
    @JoinColumn(name = "recruiter_id", referencedColumnName = "id")
    private Recruiters recruiter;

    public Contacts() {
    }

    public Contacts(String telephone, String email, Recruiters recruiter) {
        this.telephone = telephone;
        this.email = email;
        this.recruiter = recruiter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Recruiters getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(Recruiters recruiter) {
        this.recruiter = recruiter;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", recruiter=" + recruiter +
                '}';
    }
}
