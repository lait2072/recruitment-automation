package com.team13.recruitmentautomation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "consumers")
public class Consumers {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "Поле имя дожно быть заполнено")
    @Column(name = "firstname", nullable = false)
    private String firstname;

    @NotEmpty(message = "Поле фамилия дожно быть заполнено")
    @Column(name = "lastname", nullable = false)
    private String lastname;

    @NotEmpty(message = "Поле логин дожно быть заполнено")
    @Column(name = "login", nullable = false)
    private String login;

    @NotEmpty(message = "Поле пароль дожно быть заполнено")
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "consumer")
    private List<ContactRegistration> contactRegistrations;

    public Consumers() {
    }

    public Consumers(String firstname, String lastname, String login, String password, Role role) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
        this.role = role;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<ContactRegistration> getContactRegistrations() {
        return contactRegistrations;
    }

    public void setContactRegistrations(List<ContactRegistration> contactRegistrations) {
        this.contactRegistrations = contactRegistrations;
    }

    @Override
    public String toString() {
        return "Recruiters{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


